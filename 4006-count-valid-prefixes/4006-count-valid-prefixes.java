class Solution {
    public int countValidPrefixes(String s) {
       int count0=0,count1=0,c=0;
       for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count0++;
            }else{
                count1++;
            }
            if(count0+1==count1 || count1+1==count0 || count0==count1){
                c++;
            }
       }
       return c; 
    }
}