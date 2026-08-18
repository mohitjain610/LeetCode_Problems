class Solution {
    public int longestContinuousSubstring(String s) {
        int c=0,max=0;
        for(int i=0;i<s.length();i++){
            c=1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)==s.charAt(j-1)+1){
                    c++;
                }else{
                    break;
                }
            }
            if(c>max)max=c;
        }
        return max;
    }
}