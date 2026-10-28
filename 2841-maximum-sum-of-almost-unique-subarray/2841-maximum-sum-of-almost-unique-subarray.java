class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        long sum=0,max=0;
        for(int i=0;i<nums.size();i++){
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
            sum+=nums.get(i);
            if(i>=k){
                map.put(nums.get(i-k),map.getOrDefault(nums.get(i-k),0)-1);
                sum-=nums.get(i-k);
                if(map.get(nums.get(i-k))==0){
                    map.remove(nums.get(i-k));
                }
            }
            if(i>=(k-1)){
                if(map.size()>=m && sum>max)max=sum;
            }
        }
        return max;
    }
}