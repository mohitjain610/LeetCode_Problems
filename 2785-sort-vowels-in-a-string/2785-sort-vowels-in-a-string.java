class Solution {
    public boolean isVowel(char c){
        return (c=='a' ||c=='A' ||c=='e' ||c=='E' ||c=='i' ||c=='I' ||c=='o' ||c=='O' ||c=='u' ||c=='U' );
    }
    public String sortVowels(String s) {
        List<Character> list =new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i)))list.add(s.charAt(i));
        }
        Collections.sort(list);
        int k=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i)))sb.append(list.get(k++));
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}