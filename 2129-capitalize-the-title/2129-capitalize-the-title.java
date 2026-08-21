class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder s = new StringBuilder();
        int s1 = 0, e = 0;
        while (e < title.length()) {
            if (title.charAt(e) != ' ')
                e++;
            else {
                if ((e - s1) > 2) {
                    if (title.charAt(s1) >= 'a' && title.charAt(s1) <= 'z') {
                        s.append((char) (title.charAt(s1) - 32));
                    }else{
                        s.append(title.charAt(s1));
                    }
                    for (int i = s1 + 1; i < e; i++) {
                        if (title.charAt(i) >= 'A' && title.charAt(i) <= 'Z') {
                            s.append((char) (title.charAt(i) + 32));
                        }else{
                            s.append(title.charAt(i));
                        }
                    }
                } else {
                    for (int i = s1; i < e; i++) {
                        if (title.charAt(i) >= 'A' && title.charAt(i) <= 'Z') {
                            s.append((char) (title.charAt(i) + 32));
                        }
                        else{
                            s.append(title.charAt(i));
                        }
                    }
                }
                s.append(' ');
                e++;
                s1 = e;
            }
        }
        if ((e - s1) > 2) {
                    if (title.charAt(s1) >= 'a' && title.charAt(s1) <= 'z') {
                        s.append((char) (title.charAt(s1) - 32));
                    }else{
                        s.append(title.charAt(s1));
                    }
                    for (int i = s1 + 1; i < e; i++) {
                        if (title.charAt(i) >= 'A' && title.charAt(i) <= 'Z') {
                            s.append((char) (title.charAt(i) + 32));
                        }else{
                            s.append(title.charAt(i));
                        }
                    }
                } else {
                    for (int i = s1; i < e; i++) {
                        if (title.charAt(i) >= 'A' && title.charAt(i) <= 'Z') {
                            s.append((char) (title.charAt(i) + 32));
                        }
                        else{
                            s.append(title.charAt(i));
                        }
                    }
                }
        return s.toString();
    }
}