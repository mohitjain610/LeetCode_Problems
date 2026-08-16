class Solution {
    public double findMaxAverage(int[] nums, int k) {
       for(int i=1;i<nums.length;i++){
        nums[i]+=nums[i-1];
       } 
       int max=nums[k-1];
       int a=0,b=k;
       while(b<nums.length){
        if((nums[b]-nums[a])>max)max=(nums[b]-nums[a]);
        a++;
        b++;
       }
       return (double)max/k;
    }
}