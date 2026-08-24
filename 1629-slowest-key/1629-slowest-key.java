class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max=releaseTimes[0];
        char c=keysPressed.charAt(0);
        for(int i=1;i<releaseTimes.length;i++){
            int diff=releaseTimes[i]-releaseTimes[i-1];
            if(diff>max){
                max=diff;
                c=keysPressed.charAt(i);
            }else if(diff==max){
                if((int)c<(int)keysPressed.charAt(i)){
                    c=keysPressed.charAt(i);
                }
            }
        }
        return c;
    }
}