class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        int min=Integer.MAX_VALUE,a=0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min){
                min = strs[i].length();
                a=i;
            }
        }
        for(int i=0;i<min;i++){
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=strs[0].charAt(i)){
                    return s;
                }
            }
            s+=strs[0].charAt(i);
        }
        return s;
    }
}