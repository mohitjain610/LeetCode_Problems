class Solution {
    public int maxScore(int[] cardPoints, int k) {
        for(int i=1;i<cardPoints.length;i++){
            cardPoints[i]+=cardPoints[i-1];
        }
        if(cardPoints.length==k)return cardPoints[cardPoints.length-1];
        int max=Math.max(cardPoints[k-1],cardPoints[cardPoints.length-1]-cardPoints[cardPoints.length-1-k]);
        int s=cardPoints.length-k;
        for(int i=0;i<k-1;i++){
            max=Math.max(max,cardPoints[i]+(cardPoints[cardPoints.length-1]-cardPoints[s]));
            s++;
        }
        return max;
    }
}