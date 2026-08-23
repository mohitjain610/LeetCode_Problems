class Solution {
    public boolean sumGame(String num) {
        int a=0,b=0,sum1=0,sum2=0;
        for(int i=0;i<num.length()/2;i++){
            if(num.charAt(i)=='?'){
                a++;
            }else{
                sum1+=(Integer.parseInt(num.charAt(i)+""));
            }
        }
        for(int i=num.length()/2;i<num.length();i++){
            if(num.charAt(i)=='?'){
                b++;
            }else{
                sum2+=(Integer.parseInt(num.charAt(i)+""));
            }
        }
        if(a==0 && b==0){
            if(sum1==sum2)return false;
            return true;
        }
        int a1=0,b1=0,c1=0,d1=0,a2=0,b2=0,c2=0,d2=0;
        if(a%2==0){
            a1=sum1;
            b1=sum1+((a/2)*9);
            a2=sum1;
            b2=b1;
        }else{
            a1=sum1;
            b1=sum1+(((a/2)+1)*9);
            a2=sum1;
            b2=sum1+((a/2)*9);
        }
        if(b%2==0){
            c1=sum2;
            d1=sum2+((b/2)*9);
            c2=sum2;
            d2=d1;
        }else{
            c1=sum2;
            d1=sum2+(((b/2)+1)*9);
            c2=sum2;
            d2=sum2+((b/2)*9);
        }
        if(a%2!=0 && b%2!=0 ){
            int p=d1;
            d1=d2;
            d2=p;
        }
        if(b2>=d1 &&  d2>=b2 && (c2<=c1 && d2>=d1) && d2>=b1 ){
            return false;
        }
        return true;
    }
}