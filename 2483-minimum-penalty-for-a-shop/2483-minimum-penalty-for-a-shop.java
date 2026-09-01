class Solution {
    public int bestClosingTime(String customers) {
        int penalty=0;
        for(char n:customers.toCharArray()){
            if(n=='Y')penalty++;
        }
        int min=0,a=penalty;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y'){
                penalty--;
            }else{
                penalty++;
            }
            if(penalty<a){
                a=penalty;
                min=i+1;
            }
        }
        return min;
    }
}