class Solution {
    public int[] separateDigits(int[] nums) {
        int digits=0;
        for(int i=0;i<nums.length;i++){
            digits+=((int)Math.log10(nums[i])+1);
        }
        int []arr=new int[digits];
        int e=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int a=e;
            while(n>0){
                arr[e++]=n%10;
                n/=10;
            }
            int b=e-1;
            while(a<b){
                arr[a]=arr[a]^arr[b];
                arr[b]=arr[a]^arr[b];
                arr[a]=arr[a]^arr[b];
                a++;
                b--;
            }
        }
        return arr;
    }
}