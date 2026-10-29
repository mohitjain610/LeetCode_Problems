class Solution {
    public boolean isFascinating(int n) {
        int []arr=new int[10];
        int p=2*n,q=3*n;
        while(p>0){
            arr[p%10]++;
            p/=10;
        }
        while(q>0){
            arr[q%10]++;
            q/=10;
        }
        while(n>0){
            arr[n%10]++;
            n/=10;
        }
        if(arr[0]>0)return false;
        for(int i=1;i<10;i++){
            if(arr[i]!=1)return false;
        }
        return true;
    }
}