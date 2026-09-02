class Solution {
    public int addMinimum(String word) {

        int ans=0;
        if(word.charAt(0)=='c'){
            ans+=2;
        }else if(word.charAt(0)=='b'){
            ans+=1;
        }
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)=='a'){
                ans+=(99-word.charAt(i-1));
            }
            else if(word.charAt(i)=='b'){
                ans+=(100-word.charAt(i-1));
                if(word.charAt(i-1)=='a')ans-=3;
            }else{
                ans+=(101-word.charAt(i-1));
                if(word.charAt(i-1)=='a')ans-=3;
                else if(word.charAt(i-1)=='b')ans-=3;
            }
        }
        int n=word.length()-1;
        if(n==0)return 2;
        if(word.charAt(n)=='a'){
            ans+=2;
        }else if(word.charAt(n)=='b'){
            ans+=1;
        }
        return ans;
    }
}