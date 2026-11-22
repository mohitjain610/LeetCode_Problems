class Solution {
    public int countDominantElements(int[] nums) {
        if(nums.length==1)return 1;
        int c=0;
        for(int i=1;i<=nums.length-2;i++){
            if(((nums[i-1]+nums[i+1])/2d)<=nums[i])c++;
        }
        if(nums[0]>=nums[1])c++;
        if(nums[nums.length-1]>=nums[nums.length-2])c++;
        return c;
    }
}