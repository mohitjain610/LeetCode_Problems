class Solution {
    public int scoreOfParentheses(String s) {
        char [] arr=new char[s.length()];
        int top=-1,sum=0;
        boolean t=true;
        for(int i=0;i<s.length();i++){
            if(top>=0 && s.charAt(i)==')' && t){
                sum+=Math.pow(2,top);
                t=false;
                top--;
            }else if(top>=0 && s.charAt(i)==')'){
                top--;
            }else{
                arr[++top]=s.charAt(i);
                t=true;
            }
        }
        return sum;
    }
}