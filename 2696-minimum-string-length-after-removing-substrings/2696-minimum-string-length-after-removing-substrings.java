class Solution {
    public int minLength(String s) {
        char [] arr=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            if(top>-1 && ((arr[top]=='A' && s.charAt(i)=='B') || (arr[top]=='C' && s.charAt(i)=='D'))){
                top--;
            }
            else{
                arr[++top]=s.charAt(i);
            }
        }
        return top+1;
    }
}