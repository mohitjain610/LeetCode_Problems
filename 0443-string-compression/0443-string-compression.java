class Solution {
    public int compress(char[] chars) {
        int a=1;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                a++;
            }else{
                sb.append(chars[i-1]);
                if(a>1)sb.append(a);
                a=1;
            }
        }
        sb.append(chars[chars.length-1]);
        if(a>1)sb.append(a);
        for(int i=0;i<sb.length();i++){
            chars[i]=sb.charAt(i);
        }
        return sb.length();
    }
}