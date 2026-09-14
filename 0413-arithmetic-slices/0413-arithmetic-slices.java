class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length-1;i++){
            int a=0;
            if((nums[i]-nums[i-1])==(nums[i+1]-nums[i])){
                a=nums[i]-nums[i-1];
                c++;
            }
            else continue;
            for(int j=i+2;j<nums.length;j++){
                if((nums[j]-nums[j-1])==a)c++;
                else break;
            }
            
        }
        return c++;
    }
}