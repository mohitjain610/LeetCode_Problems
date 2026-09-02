class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String [] arr=s.split("\\s+");
        int s1=0,e=arr.length-1;
        while(s1<e){
            String temp=arr[s1];
            arr[s1]=arr[e];
            arr[e]=temp;
            s1++;
            e--;
        } 
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length-1;i++){
            sb.append(arr[i]);
            sb.append(" ");
        }
        sb.append(arr[arr.length-1]);
        return sb.toString();
    }
}