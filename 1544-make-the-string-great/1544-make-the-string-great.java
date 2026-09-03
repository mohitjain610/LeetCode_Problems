class Solution {
    public String makeGood(String s) {
        char [] arr= new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            if(top>=0 && (arr[top]==(s.charAt(i)+32)|| arr[top]==(s.charAt(i)-32))){
                top--;
            }else{
                arr[++top]=s.charAt(i);
            }
        }
        return new String(arr,0,top+1);
    }
}