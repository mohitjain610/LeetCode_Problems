class Solution {
    public int maximumSwap(int num) {
        if (num == 0)
            return 0;
        int n = (int) Math.log10(num) + 1;
        if (n == 1)
            return num;
        int[] arr = new int[n];
        int i = n - 1;
        int c = num;
        while (c > 0) {
            arr[i--] = c % 10;
            c /= 10;
        }
        for (i = 0; i < n; i++) {
            if (arr[i] < 9)
                break;
        }
        if (i == n)
            return num;
        int max = i;
        boolean t=true;
        while (i < n && t) {
            max = i;
            for (int j = n - 1; j > i; j--) {
                if (arr[max] < arr[j]) {
                    max = j;
                    t=false;
                }
            }
            i++;
        }
       
        if (arr[max] > arr[i-1]) {
            arr[i-1] = arr[i-1] ^ arr[max];
            arr[max] = arr[i-1] ^ arr[max];
            arr[i-1] = arr[i-1] ^ arr[max];
        }

        int a = 0;
        for (int p = 0; p < n; p++) {
            a = (a * 10) + arr[p];
        }
        return a;
    }
}