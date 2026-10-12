class Solution {
    public int longestOnes(int[] nums, int k) {
        int a=0;
        int j=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)a++;
             while(a>k){
                if(nums[j]==0)a--;
                j++;
            }
            max=Math.max(max,(i-j+1));
        }
        return max;
    }
}