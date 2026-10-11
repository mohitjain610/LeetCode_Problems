class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb=new StringBuilder();
        HashMap<String,String>map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        int a=-1,b=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                a=i;
                // if(b==0)sb.append(s.substring(b,a));
                 sb.append(s.substring(b+1,a));
            }
            else if(s.charAt(i)==')'){
                b=i;
                String p=s.substring(a+1,b);
                if(map.containsKey(p)){
                    sb.append(map.get(p));
                }else{
                    sb.append('?');
                }
            }
        }
        sb.append(s.substring(b+1,s.length()));
        if(a==-1 && b==-1)return s;
        return sb.toString();
    }
}   