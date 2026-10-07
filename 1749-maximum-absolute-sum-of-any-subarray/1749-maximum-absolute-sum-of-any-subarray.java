class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxPositive=Integer.MIN_VALUE,sum1=0;
        int maxNegative=Integer.MAX_VALUE,sum2=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
            sum2+=nums[i];
            if(maxPositive<sum1)maxPositive=sum1;
            if(maxNegative>sum2)maxNegative=sum2;
            if(sum1<0)sum1=0;
            if(sum2>0)sum2=0;
        }
        return Math.max(maxPositive,Math.abs(maxNegative));
    }
}