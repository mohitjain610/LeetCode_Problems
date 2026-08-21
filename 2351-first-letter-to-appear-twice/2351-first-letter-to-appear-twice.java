class Solution {
    public char repeatedCharacter(String s) {
      int []f=new int[26];
      for(int i=0;i<s.length();i++){
            if(f[s.charAt(i)-'a']==1){
                return s.charAt(i);
            }else{
                f[s.charAt(i)-'a']++;
            }
      } 
      return 'c'; 
    }
}