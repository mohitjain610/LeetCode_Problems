class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0,square=0;
        while(n>0){
            int r=n%10;
            sum+=r;
            square+=(r*r);
            n/=10;
        }
        if(square-sum>=50)return true;
        return false;
    }
}