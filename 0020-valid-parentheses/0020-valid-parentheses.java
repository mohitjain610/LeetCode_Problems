class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)return false;
        Stack<Character> st=new Stack<>();
        for(char n:s.toCharArray()){
            if(n=='('||n=='['||n=='{'){
                st.push(n);
            }else{
                if(st.size()==0)return false;
                if(n==')' && st.peek()=='(' && st.size()!=0){
                    st.pop();
                }else if(n==']' && st.peek()=='[' && st.size()!=0){
                    st.pop();
                }else if(n=='}' && st.peek()=='{' && st.size()!=0){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }if(st.size()==0){
            return true;
        }
        return false;
    }
}