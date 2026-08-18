class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        int []arr=new int[26];
        if(s.length()<p.length())return list;
        int k=p.length();
        for(int i=0;i<k;i++){
            arr[p.charAt(i)-'a']++;
        }
        for(int i=0;i<k;i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        boolean t=true;
        for(char key:map.keySet()){
            if(map.get(key)!=arr[key-'a']){
                t=false;
                break;
            }
        }
        if(t)list.add(0);
        for(int i=k;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
            map.put(s.charAt(i-k),map.get(s.charAt(i-k))-1);
            if(map.get(s.charAt(i-k))==0){
                map.remove(s.charAt(i-k));
            }
            t=true;
            for(char key:map.keySet()){
                if(map.get(key)!=arr[key-'a']){
                    t=false;
                    break;
                }
            }
            if(t)list.add(i-k+1);
        }
        return list;
    }
}