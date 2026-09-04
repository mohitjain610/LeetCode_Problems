class Solution {
    public String removeDuplicates(String s, int k) {
        char[] arr = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            if (top >= k - 2) {
                boolean t = true;
                for (int j = top; j > top+1-k; j--) {
                    if (arr[j] != s.charAt(i)) {
                        arr[++top] = s.charAt(i);
                        t = false;
                        break;
                    }
                }
                if (t) {
                    top -= (k - 1);
                }
            } else {
                arr[++top] = s.charAt(i);
            }
        }
        return new String(arr, 0, top + 1);
    }
}