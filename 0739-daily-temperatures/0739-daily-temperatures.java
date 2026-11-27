class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] answer=new int[temperatures.length];
        int [] stack1=new int[temperatures.length];
        int [] stack2=new int[temperatures.length];
        int top1=-1;
        int top2=-1;
        for(int i=temperatures.length-1;i>=0;i--){
            if(top1==-1){
                answer[i]=0;
                stack2[++top2]=1;
            }
            else if(temperatures[i]<stack1[top1]){
                answer[i]=1;
                stack2[++top2]=1;
            }else if(temperatures[i]>=stack1[top1]){
                int c=1;
                while(top1>=0 && temperatures[i]>=stack1[top1]){
                    c+=stack2[top2];
                    top1--;
                    top2--;
                }
                if(top1==-1)answer[i]=0;
                else {
                    answer[i]=c;
                }
                stack2[++top2]=c;
            }
            stack1[++top1]=temperatures[i];
        }
        return answer;
    }
}