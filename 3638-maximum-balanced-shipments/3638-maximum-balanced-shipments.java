class Solution {
    public int maxBalancedShipments(int[] weight) {
        int max=Integer.MIN_VALUE,c=0;
        for(int i=0;i<weight.length;i++){
            if(max>weight[i]){
                c++;
                max=Integer.MIN_VALUE;
            }else{
                max=Math.max(max,weight[i]);
            }
        }
        return c;
    }
}