class Solution {
    public int countAsterisks(String s) {
        int a=0,c=0;
        for(int i=0;i<s.length();i++){
            if(a%2==0 && s.charAt(i)=='*')c++;
            else if(s.charAt(i)=='|')a++;
        }
        return c;
    }
}