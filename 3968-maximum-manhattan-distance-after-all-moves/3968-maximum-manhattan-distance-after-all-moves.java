class Solution {
    public int maxDistance(String moves) {
        int l=0,u=0,a=0;
        for(char n:moves.toCharArray()){
            if(n=='L')l++;
            else if(n=='R')l--;
            else if(n=='U')u++;
            else if(n=='D')u--;
            else a++;
        }
        return Math.abs(l)+Math.abs(u)+a;
    }
}