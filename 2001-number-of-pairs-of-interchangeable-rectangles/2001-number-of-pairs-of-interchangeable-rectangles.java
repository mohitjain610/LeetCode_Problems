class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double,Long> map=new HashMap<>();
        for(int [] n:rectangles){
            double a=(double)n[0]/n[1];
            map.put(a,map.getOrDefault(a,(long)0)+1);
        }
        long ans=0;
        for(double key:map.keySet()){
            long a=map.get(key);
            ans+=((a*(a-1))/2);
        }
        return ans;
    }
}