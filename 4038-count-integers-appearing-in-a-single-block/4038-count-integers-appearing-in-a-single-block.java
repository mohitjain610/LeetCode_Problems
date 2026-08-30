class Solution {
    public int countSpecialIntegers(int[] nums) {
        int [] arr=new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int s=0,e=0,c=0;
        while(e<nums.length){
            if(nums[s]==nums[e]){
                e++;
            }else{
                if(arr[nums[s]]-(e-s)==0)c++;
                s=e;
            }
        }
        if(arr[nums[s]]-(e-s)==0)c++;
        return c;
    }
}