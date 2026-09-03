class Solution {
    public boolean isValid(String s) {
        char [] arr=new char [s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            if(top>0 && arr[top]=='b' && arr[top-1]=='a' && s.charAt(i)=='c'){
                top-=2;
            }else{
                arr[++top]=s.charAt(i);
            }
        }
        if(top==-1)return true;
        return false;
    }
}