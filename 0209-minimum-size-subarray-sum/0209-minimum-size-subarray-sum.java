class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE,s=0,e=0,sum=0;
        while(s<nums.length){
            if(e<nums.length && sum<target){
                sum+=nums[e];
                e++;
            }else{
                if(sum>=target && (e-s)<ans){
                    ans=e-s;
                }
                sum-=nums[s];
                s++;
            }
        }
        if(ans==Integer.MAX_VALUE)return 0;
        return ans;
    }
}