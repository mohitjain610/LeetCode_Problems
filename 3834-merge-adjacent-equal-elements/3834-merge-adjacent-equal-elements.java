class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> list =new ArrayList<>();
        long [] arr=new long[nums.length];
        int top=-1;
        int i=0;
        while(i<nums.length){
            
            if(top>=1 && arr[top]==arr[top-1]){
                arr[top-1]=2*arr[top];
                top--;
            }else{
                arr[++top]=nums[i];
                i++;
                // if(i==nums.length)break;
                
            }
        }while(true){
        if(top>=1 && arr[top]==arr[top-1]){
                arr[top-1]=2*arr[top];
                top--;
            }else{
                break;
            }
        }
        for(i=0;i<=top;i++){
            list.add(arr[i]);
        }
        return list;
    }
}