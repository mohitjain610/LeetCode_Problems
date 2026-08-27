class Solution {
    public int minimumSwaps(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int c=0;
        while(s<e){
            if(nums[s]!=0)s++;
            else if(nums[e]==0)e--;
            else {
                c++;
                s++;
                e--;
            }
        }
        return c;
    }
}