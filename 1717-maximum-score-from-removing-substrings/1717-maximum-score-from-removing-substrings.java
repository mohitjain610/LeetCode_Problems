class Solution {
    public int maximumGain(String s, int x, int y) {
        char [] arr=new char[s.length()];
        int top=-1,ans=0;
        if(x>y){
            for(int i=0;i<s.length();i++){
                if(top>-1 && arr[top]=='a' && s.charAt(i)=='b'){
                    ans+=x;
                    top--;
                }else{
                    arr[++top]=s.charAt(i);
                }
            }
            s=new String(arr,0,top+1);
            top=-1;
            for(int i=0;i<s.length();i++){
                if(top>-1 && arr[top]=='b' && s.charAt(i)=='a'){
                    ans+=y;
                    top--;
                }else{
                    arr[++top]=s.charAt(i);
                }
            }
        }else{
            for(int i=0;i<s.length();i++){
                if(top>-1 && arr[top]=='b' && s.charAt(i)=='a'){
                    ans+=y;
                    top--;
                }else{
                    arr[++top]=s.charAt(i);
                }
            }
            s=new String(arr,0,top+1);
            top=-1;
            for(int i=0;i<s.length();i++){
                if(top>-1 && arr[top]=='a' && s.charAt(i)=='b'){
                    ans+=x;
                    top--;
                }else{
                    arr[++top]=s.charAt(i);
                }
            }
        }
        return ans;
    }
}