class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0, max = 0, c = minutes - 1;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                sum += customers[i];
            }
        }
        if (sum > max) {
            c = minutes - 1;
            max = sum;
        }
        for (int i = minutes; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                sum += customers[i];
            }
            if(grumpy[i-minutes] == 1)sum-= customers[i-minutes];
            if (sum > max) {
                c = i;
                max = sum;
            }
        }
        int ans = 0;
        for (int i = 0; i <= c - minutes; i++) {
            if (grumpy[i] == 0)
                ans += customers[i];
        }
        for (int i = c + 1; i < customers.length; i++) {
            if (grumpy[i] == 0)
                ans += customers[i];
        }
        for (int i = c - minutes + 1; i <= c; i++) {
            ans += customers[i];
        }
        return ans;
    }
}