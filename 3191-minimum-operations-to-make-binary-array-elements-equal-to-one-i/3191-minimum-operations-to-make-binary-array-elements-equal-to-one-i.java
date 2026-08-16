class Solution {
    public int minOperations(int[] nums) {
        int s=0,c=0;
        while(s<nums.length){
            if(nums[s]==0){
                if(s+3<=nums.length){
                    nums[s]=1;
                    if(nums[s+1]==0)nums[s+1]=1;
                    else nums[s+1]=0;
                    if(nums[s+2]==0)nums[s+2]=1;
                    else nums[s+2]=0;
                    c++;
                    s++;
                }else{
                    return -1;
                }
            }else{
                s++;
            }
        }
        return c;
    }
}