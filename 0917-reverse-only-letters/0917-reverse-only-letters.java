class Solution {
    public String reverseOnlyLetters(String s) {
        char [] str=s.toCharArray();
        int s1=0,e=s.length()-1;
        while(s1<e){
            if(str[s1]<65  || (str[s1]>90 && str[s1]<97)){
                s1++;
            }
            else if(str[e]<65  || (str[e]>90 && str[e]<97)){
                e--;
            }
            else{
                char temp=str[s1];
                str[s1]=str[e];
                str[e]=temp;
                s1++;
                e--;
            }
        }
        return new String(str);
    }
}