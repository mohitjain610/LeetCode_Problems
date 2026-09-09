class Solution {
    public long countCommas(long n) {
      long ans=0;
      if(n<1000)return 0;
      else if(n>=1000 && n<=999999)return n-999; 
      else if(n>=1000000 && n<=999999999){
        ans+=(999000);
        ans+=((n-999999)*2);
        return ans;
      }
      else if(n>=(1000000000L) && n<=999999999999L){
        ans+=(999000);
        ans+=((999000000)*2);
        ans+=((n-999999999)*3);
        return ans;
      }
      else if(n>=1000000000000L && n<=999999999999999L){
        ans+=(999000);
        ans+=((999000000)*2);
        ans+=((999000000000L)*3);
        ans+=((n-999999999999L)*4);
        return ans;
      }else{
         ans+=(999000);
        ans+=((999000000)*2);
        ans+=((999000000000L)*3);
        ans+=((n-999999999999L)*4);
        return ans+1;
      }
    }
}