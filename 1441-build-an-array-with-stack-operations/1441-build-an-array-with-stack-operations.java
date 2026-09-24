class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList<>();
        int top=0;
        for(int i=1;i<=n && top<target.length;i++){
            if(target[top]==i){
                list.add("Push");
                top++;
            }else{
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}