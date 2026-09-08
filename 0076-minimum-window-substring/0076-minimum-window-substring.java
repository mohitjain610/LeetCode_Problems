class Solution {
    public String minWindow(String s, String t) {
        int [] arr1=new int[60];
        for(char n:t.toCharArray()){
            arr1[n-'A']++;
        }
        int [] arr2=new int[60];
        int a=0,e=0,min=s.length();   //check 
        String ans="";
        while(a<s.length()){
            boolean p=true;
            for(int i=0;i<60;i++){
                if(arr1[i]>0 && arr1[i]>arr2[i]){
                    p=false;
                    break;
                }
            }
            if(e<s.length() && p==false){
                arr2[s.charAt(e)-'A']++;
                e++;
            }else{
                if(p && (e-a)<=min){
                    min=e-a;
                    ans=s.substring(a,e);
                }
                arr2[s.charAt(a)-'A']--;
                a++;
            }
        }
        return ans;
    }
}