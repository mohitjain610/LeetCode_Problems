class Solution {
    public int longestContinuousSubstring(String s) {
        int c=1,max=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)+1){
                c++;
                if(c>max)max=c;
            }else{
                c=1;
            }   
        }
        return max;
    }
}