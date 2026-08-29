class Solution {
    public String removeTrailingZeros(String num) {
        int j=num.length()-1;
        for(j=num.length()-1;j>0;j--){
            if(num.charAt(j)!='0'){
                break;
            }
        }
        return num.substring(0,j+1);
       
    }
}