class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] arr=new int[256];
        int left=0,right=0,max=0;
        while(left<s.length()){
            if(right<s.length() && arr[s.charAt(right)]==0){
                arr[s.charAt(right)]++;
                right++;
            }else{
                if((right-left)>max)max=(right-left);
                arr[s.charAt(left)]--;
                left++;
            }
        }
        return max;
        // HashMap<Character,Integer> map=new HashMap<>();
        // int left=0,right=0,max=0;
        // while(left<s.length()){
        //     if(right==s.length()){
        //         if(map.size()>max)max=map.size();
        //         map.remove(s.charAt(left));
        //         left++;
        //     }
        //     else if(!map.containsKey(s.charAt(right))){
        //         map.put(s.charAt(right),1);
        //         right++;
        //     }else{
        //         if(map.size()>max)max=map.size();
        //         map.remove(s.charAt(left));
        //         left++;
        //     }
        // }
        // return max;
    }
}