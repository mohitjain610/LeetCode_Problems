class Solution {
    public int largestInteger(int[] nums, int k) {
        int [] arr=new int[51];
        for(int n:nums){
            arr[n]++;
        }
        int max=-1;
        if(k==1){
            for(int n:nums){
                if(n>max && arr[n]==1)max=n;
            }
            return max;
        }
        else if(k==nums.length){
            for(int n:nums){
                if(n>max)max=n;
            }
            return max;
        }
        
        if(nums[0]==nums[nums.length-1])return -1;
        boolean a=true,b=true;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==nums[0]){
                a=false;
            }else if(nums[i]==nums[nums.length-1]){
                b=false;
            }
        }
        if(a && b){
            return Math.max(nums[0],nums[nums.length-1]);
        }else if(a){
            return nums[0];
        }else if(b){
            return nums[nums.length-1];
        }else{
            return -1;
        }
    }
}