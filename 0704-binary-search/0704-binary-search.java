class Solution {
    public int p(int[] arr,int low,int high, int target){
        if(low>high)return -1;
        int mid=low+(high-low)/2;
        if(arr[mid]==target)return mid;
        else if(arr[mid]>target)return p(arr,low,mid-1,target);
        else return p(arr,mid+1,high,target);
    }
    public int search(int[] nums, int target) {
        
        return p(nums,0,nums.length-1,target);
    }
}