class Solution {
    public String resultingString(String s) {
        char [] arr=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            if(top>-1 && ((s.charAt(i)+1==arr[top])|| (s.charAt(i)==arr[top]+1) || 
            (s.charAt(i)=='a' && arr[top]=='z') || (s.charAt(i)=='z' && arr[top]=='a') )){
                top--;
            }else{
                arr[++top]=s.charAt(i);
            }
        }
        return new String(arr,0,top+1);
    }
}