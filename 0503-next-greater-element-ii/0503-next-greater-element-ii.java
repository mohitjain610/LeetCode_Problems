class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int []arr=new int[2*nums.length];
        int []ar=new int [nums.length];
        int top=-1;
        for(int i=nums.length-2;i>=0;i--){
            arr[++top]=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            if(top==-1){
                ar[i]=-1;
            }else if(arr[top]>nums[i]){
                ar[i]=arr[top];
            }else if(arr[top]<=nums[i]){
                while(top>=0 && arr[top]<=nums[i])top--;
                if(top==-1){
                    ar[i]=-1;
                }else{
                    ar[i]=arr[top];
                }
            }
            arr[++top]=nums[i];
        }
        return ar;
    }
}