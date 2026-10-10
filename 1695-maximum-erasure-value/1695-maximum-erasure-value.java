class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int [] arr=new int[100001];
        int j=0,sum=0,max=0;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
            sum+=nums[i];
            while(arr[nums[i]]>1){
                sum-=nums[j];
                arr[nums[j++]]--;
            }
            if(sum>max)max=sum;
        }
        return max;
    }
}