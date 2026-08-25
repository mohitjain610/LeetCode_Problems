class Solution {
    public int missingMultiple(int[] nums, int k) {
        int []arr=new int [(100/k)+1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                arr[nums[i]/k]+=1;
            }
        }
        int i=1;
        for(i=1;i<arr.length;i++){
            if(arr[i]==0)return i*k;
        }
        return i*k;
    }
}