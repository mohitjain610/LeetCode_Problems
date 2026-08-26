class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left=0,right=0,c1=0;
        String a="";
        while(left<s.length()){
            if(c1==k){
                if(a.length()==0){
                    a=s.substring(left,right);
                }else if(a.length()>(right-left) ){
                    a=s.substring(left,right);
                }else if(a.length()==(right-left)){
                    if(a.compareTo(s.substring(left,right))>0){
                        a=s.substring(left,right);
                    }
                }
                if(s.charAt(left)=='1'){
                    c1--;
                }
                left++;
            }
            else if(right==s.length()){
                if(s.charAt(left)=='1'){
                    c1--;
                }
                left++;
            }
            else if(right!=s.length()){
                if(s.charAt(right)=='1'){
                    c1++;
                }
                right++;
            }
        }
        return a;
    }
}