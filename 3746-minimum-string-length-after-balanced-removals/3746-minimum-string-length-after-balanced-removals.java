class Solution {
    public int minLengthAfterRemovals(String s) {
        char [] arr=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            if(top>-1 && ((s.charAt(i)=='a' && arr[top]=='b') || (s.charAt(i)=='b' && arr[top]=='a'))){
                top--;
            }else{
                arr[++top]=s.charAt(i);
            }
        }
        return top+1;
    }
}