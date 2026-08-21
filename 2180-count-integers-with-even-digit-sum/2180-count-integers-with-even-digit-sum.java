class Solution {
    public int sum(int n){
        int s=0;
        while(n>0){
            s+=(n%10);
            n/=10;
        }
        return s;
    }
    public int countEven(int num) {
        int c=0;
        for(int i=2;i<=num;i++){
            if(sum(i)%2==0)c++;
        }
        return c;
    }
}