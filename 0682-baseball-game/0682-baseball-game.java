class Solution {
    public int calPoints(String[] operations) {
        int []stack=new int[operations.length];
        int top=-1;
        for(int i=0;i<operations.length;i++){
            String ch=operations[i];
            if(ch.equals("D") && top>=0){
                top++;
                stack[top]=2*stack[top-1];
            }
            else if(ch.equals("C") && top>=0){
                top--;
            }else if(top>=1 && ch.equals("+")){
                top++;
                stack[top]=stack[top-2]+stack[top-1];
            }
            else if(!(ch.equals("D") && ch.equals("C") && ch.equals("+"))){
                stack[++top]=Integer.parseInt(ch);
            }
        }
        int sum=0;
        for(int i=0;i<=top;i++){
            sum+=stack[i];
        }
        return sum;
    }
}