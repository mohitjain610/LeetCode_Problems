class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
       int e1=a.length()-1,e2=b.length()-1;
       int carry=0;
       while(e1>=0 && e2>=0){
            if(carry==0){
                if((a.charAt(e1)=='0' && b.charAt(e2)=='1') || (a.charAt(e1)=='1' && b.charAt(e2)=='0')){
                    sb.append('1');
                    carry=0;
                }else if(a.charAt(e1)=='1' && b.charAt(e2)=='1'){
                    sb.append('0');
                    carry=1;
                }else{
                    sb.append('0');
                    carry=0;
                }
            }else{
                if((a.charAt(e1)=='0' && b.charAt(e2)=='1') || (a.charAt(e1)=='1' && b.charAt(e2)=='0')){
                    sb.append('0');
                    carry=1;
                }else if(a.charAt(e1)=='1' && b.charAt(e2)=='1'){
                    sb.append('1');
                    carry=1;
                }else{
                    sb.append('1');
                    carry=0;
                }
            }
            e1--;
            e2--;
       }
       while(e1>=0){
            if(carry==0){
                if(a.charAt(e1)=='0'){
                    sb.append('0');
                    carry=0;
                }else {
                    sb.append('1');
                    carry=0;
                }
            }else{
                if(a.charAt(e1)=='0'){
                    sb.append('1');
                    carry=0;
                }else {
                    sb.append('0');
                    carry=1;
                }
            }
            e1--;
       }
       while(e2>=0){
            if(carry==0){
                if(b.charAt(e2)=='0'){
                    sb.append('0');
                    carry=0;
                }else {
                    sb.append('1');
                    carry=0;
                }
            }else{
                if(b.charAt(e2)=='0'){
                    sb.append('1');
                    carry=0;
                }else {
                    sb.append('0');
                    carry=1;
                }
            }
            e2--;
       }
       if(carry==1){
         sb.append('1');
       }
       return sb.reverse().toString();
    }
}