class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        for(int i=1;i<nums.length;i++){
            nums[i]^=nums[i-1];
        }
        int s=0,e=nums.length-1;
        while(s<e){
            nums[s]=nums[s]^nums[e];
            nums[e]=nums[s]^nums[e];
            nums[s]=nums[s]^nums[e];
            s++;
            e--;
        }
        int max=(int)Math.pow(2,maximumBit)-1;
        for(int i=0;i<nums.length;i++){
            nums[i]^=max;
        }
        return nums;
    }
}