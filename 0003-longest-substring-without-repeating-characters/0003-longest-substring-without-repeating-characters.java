class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0,right=0,max=0;
        while(left<s.length()){
            if(right==s.length()){
                if(map.size()>max)max=map.size();
                map.remove(s.charAt(left));
                left++;
            }
            else if(!map.containsKey(s.charAt(right))){
                map.put(s.charAt(right),1);
                right++;
            }else{
                if(map.size()>max)max=map.size();
                map.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}