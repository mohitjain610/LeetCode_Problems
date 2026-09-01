class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length())
            return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (char ch : s1.toCharArray()) {
            arr1[ch - 'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            arr2[s2.charAt(i) - 'a']++;
        }
        boolean t = true;
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                t = false;
                break;
            }
        }
        if (t)
            return t;
        for (int i = s1.length(); i < s2.length(); i++) {
            arr2[s2.charAt(i) - 'a']++;
            arr2[s2.charAt(i - s1.length()) - 'a']--;
            t = true;
            for (int j = 0; j < 26; j++) {
                if (arr1[j] != arr2[j]) {
                    t = false;
                    break;
                }
            }
            if (t)
                return t;
        }
        return false;
    }
}