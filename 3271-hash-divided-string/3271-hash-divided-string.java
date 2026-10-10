class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=(s.charAt(i)-97);
            if((i+1)%k==0){
                sum%=26;
                sb.append((char)(sum+97));
                sum=0;
            }
        }
        return sb.toString();
    }
}
 