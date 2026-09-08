class Solution {
    public int[][] generateMatrix(int n) {
        int [][] arr=new int[n][n];
        int a=0,b=n-1,c=1;
        while(c<=(n*n)){
            for(int j=a;j<=b;j++){
                arr[a][j]=c;
                c++;
            }
            for(int j=a+1;j<=b;j++){
                arr[j][b]=c;
                c++;
            }
            for(int j=b-1;j>=a;j--){
                arr[b][j]=c;
                c++;
            }
            for(int j=b-1;j>a;j--){
                arr[j][a]=c;
                c++;
            }
            a++;
            b--;
        }
        return arr;
    }
}