class Solution {
    public int minimumArea(int[][] grid) {
        int x=Integer.MIN_VALUE,y=Integer.MIN_VALUE;
        int p=Integer.MAX_VALUE,q=Integer.MAX_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    if(i>x)x=i;
                    if(j>y)y=j;
                    if(i<p)p=i;
                    if(j<q)q=j;
                }
            }
        }
        return (((x-p)+1)*((y-q)+1));
    }
}