class Solution {
    public String removeOccurrences(String s, String part) {
        char [] arr=new char[s.length()];
        int top=-1;
        int p=part.length();
        for(int i=0;i<s.length();i++){
            if(top>=(p-1) && part.equals(new String(arr,((top+1)-p),p))){
                top-=p;
            }else{
                arr[++top]=s.charAt(i);
                if(top>=(p-1) && part.equals(new String(arr,((top+1)-p),p))){
                top-=p;
                }
            }
        }
        return new String(arr,0,top+1);
    }
}