class Solution {
    public int numOfPairs(String[] nums, String target) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String x:nums)map.put(x,map.getOrDefault(x,0)+1);
        int c=0;
        for(String s:nums){
            if(target.startsWith(s)){
                String a=target.substring(s.length());
                if(map.containsKey(a)){
                    if(a.equals(s))c+=(map.get(a)-1);
                    else c+=map.get(a);
                }
            }
        }
        return c;
    }
}