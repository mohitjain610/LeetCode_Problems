class Solution {
    public boolean checkDivisibility(int n) {
        int s=0,p=1,a=n;
            while(a>0){
            int r=a%10;
            s+=r;
            p*=r;
            a/=10;
        }
        if(n%(s+p)==0)return true;
        return false;
    }
}