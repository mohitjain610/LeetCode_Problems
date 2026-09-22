class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int[] arr = new int[pushed.length];
        int top = -1;
        int i = 0, j = 0;
        while (j < pushed.length) {
            if (top >= 0 && arr[top] == popped[j]) {
                top--;
                j++;
            } else if (i >= pushed.length && arr[top] != popped[j]) {
                break;
            } else if (i < pushed.length) {
                arr[++top] = pushed[i++];
            }
        }
        if (top == -1)
            return true;
        return false;
    }
}