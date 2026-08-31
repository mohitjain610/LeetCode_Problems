class Solution {
    public int maximumLengthSubstring(String s) {
        int [] arr=new int [26];
        int a=0,b=0,max=0;
        while(b<s.length()){
            if(arr[s.charAt(b)-'a']<2){
                arr[s.charAt(b)-'a']++;
                b++;
            }else{
                if(max<(b-a))max=b-a;
                arr[s.charAt(a)-'a']--;
                a++;
            }
        }
        if(max<(b-a))max=b-a;
        return max;
    }
}