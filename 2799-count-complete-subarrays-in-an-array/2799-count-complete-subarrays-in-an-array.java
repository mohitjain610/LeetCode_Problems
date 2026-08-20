class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int k=set.size();
        int c=0;
        for(int i=0;i<=nums.length-k;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i;j<k+i;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            }
            if(map.size()==k)c++;
            for(int j=i+k;j<nums.length;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                if(map.size()==k)c++;
            }
        }
        return c;
    }
}