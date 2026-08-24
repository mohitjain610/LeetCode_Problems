class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        int s1 = 0, e = s.length()-1;
        while (s1 < e) {
            if (s.charAt(s1) != 'a' && s.charAt(s1) != 'A' && s.charAt(s1) != 'e' && s.charAt(s1) != 'E'
                    && s.charAt(s1) != 'i' && s.charAt(s1) != 'I' && s.charAt(s1) != 'o' && s.charAt(s1) != 'O'
                    && s.charAt(s1) != 'u' && s.charAt(s1) != 'U') {
                s1++;
            }
            else if (s.charAt(e) != 'a' && s.charAt(e) != 'A' && s.charAt(e) != 'e' && s.charAt(e) != 'E'
                    && s.charAt(e) != 'i' && s.charAt(e) != 'I' && s.charAt(e) != 'o' && s.charAt(e) != 'O'
                    && s.charAt(e) != 'u' && s.charAt(e) != 'U') {
                e--;
            }else{
                char t=s.charAt(s1);
                sb.setCharAt(s1,s.charAt(e));
                sb.setCharAt(e,t);
                s1++;
                e--;
            }
        }
        return sb.toString();
    }
}