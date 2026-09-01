class Solution {
    public String removeDuplicates(String s) {
        // Stack<Character> st=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     if(st.size()>0 && st.peek()==s.charAt(i)){
        //         st.pop();
        //     }else{
        //         st.push(s.charAt(i));
        //     }
        // }
        // StringBuilder sb=new StringBuilder();
        // while(st.size()>0){
        //     sb.append(st.pop());
        // }
        // return sb.reverse().toString();
        char [] arr=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            if(top>-1 && arr[top]==s.charAt(i)){
                top--;
            }else{
                arr[++top]=s.charAt(i);
                
            }
        }
        return new String(arr,0,top+1);
    }
}