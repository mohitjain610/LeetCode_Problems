class Solution {
    public int minInsertions(String s) {
        char [] arr=new char[s.length()];
        int top=-1,a=0;
        for(int i=0;i<s.length();i++){
            if(top>=0 && arr[top]=='(' && i<s.length()-1 && s.charAt(i)==')' && s.charAt(i+1)==')'){
                top--;
                i++;
            }else{
                if(s.charAt(i)=='(')arr[++top]=s.charAt(i);
                else if(s.charAt(i)==')' && top>=0 &&arr[top]=='(' && ((i+1)>=s.length() || s.charAt(i+1)=='(')){
                    top--;
                    a++;
                }
                else if(s.charAt(i)==')' && top==-1 && ((i+1)>=s.length() || s.charAt(i+1)=='('))a+=2;
                else if(s.charAt(i)==')' && top==-1 && s.charAt(i+1)==')'){
                    a++;
                    i++;}
            }
        }
        if(top>=0)a+=((top+1)*2);
        return a;
    }
}