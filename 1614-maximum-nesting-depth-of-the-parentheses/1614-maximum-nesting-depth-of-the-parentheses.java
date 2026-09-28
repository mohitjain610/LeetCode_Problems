class Solution {
    public int maxDepth(String s) {
        char [] arr=new char[s.length()];
        int top=-1;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(top>-1 && s.charAt(i)==')'){
                if(max<(top+1))max=top+1;
                top--;
            }
            else if(s.charAt(i)=='('){
                arr[++top]='(';
            }
        }
        return max;
    }
}