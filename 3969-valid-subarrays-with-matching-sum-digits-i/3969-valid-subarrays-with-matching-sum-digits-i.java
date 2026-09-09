class Solution {
    public boolean satisfied(long sum,int x){
        int a=(int)(sum%10);
        int b=(int)(sum/Math.pow(10,(int)Math.log10(sum)));
        if(a==b && a==x)return true;
        return false;
    }
    public int countValidSubarrays(int[] nums, int x) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            long sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(satisfied(sum,x))c++;
            }
        }
        return c;
    }
}