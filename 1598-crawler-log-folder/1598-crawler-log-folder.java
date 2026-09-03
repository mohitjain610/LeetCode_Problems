class Solution {
    public int minOperations(String[] logs) {
       int c=0;
       for(String s:logs){
            if(s.equals("../") && c!=0){
                c--;
            }else if(s.equals("./")){

            }else if(!s.equals("../")){
                c++;
            }
       } 
       return c;
    }
}