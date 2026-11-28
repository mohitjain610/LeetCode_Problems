class Solution {
    public String stack(String s){
        char [] arr=new char[s.length()];
        int top=-1;
        for(int i=0;i<arr.length;i++){
            char ch=s.charAt(i);
            if(ch!='#'){
                arr[++top]=ch;
            }else if(top>=0){
                top--;
            }
        }
        return new String(arr,0,top+1);
    }
    public boolean backspaceCompare(String s, String t) {
        if(stack(s).equals(stack(t)))return true;
        return false;
    }
}