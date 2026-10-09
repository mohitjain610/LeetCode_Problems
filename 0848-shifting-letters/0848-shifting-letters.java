class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        shifts[s.length()-1]%=26;
        for(int i=shifts.length-2;i>=0;i--){
            shifts[i]+=shifts[i+1];
            shifts[i]%=26;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'a'+1+shifts[i])>26)sb.append((char)(((s.charAt(i)-'a'+1+shifts[i])%26)+'a'-1));
            else{
            sb.append((char)(s.charAt(i)+shifts[i]));}
        }
        return sb.toString();
    }
}