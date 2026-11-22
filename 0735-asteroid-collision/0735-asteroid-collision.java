class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int []arr=new int[asteroids.length];
        int top=-1;
        for(int i=0;i<asteroids.length;i++){
            if(top==-1)arr[++top]=asteroids[i];
            else if(asteroids[i]<0 && arr[top]>0){
                int t=0;
                while(top>=0 && arr[top]>0){
                    if(Math.abs(asteroids[i])>arr[top]){
                        top--;
                    }else if(Math.abs(asteroids[i])<arr[top]){
                        t=1;
                        break;}
                    else {
                        t=1;
                        top--;
                        break;
                        }
                }
                if(t==0)arr[++top]=asteroids[i];
            }else{
                arr[++top]=asteroids[i];
            }
        }
        return Arrays.copyOf(arr,top+1);
    }
}