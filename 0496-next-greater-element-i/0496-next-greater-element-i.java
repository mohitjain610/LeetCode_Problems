class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++)map.put(nums1[i],i);
        int []arr=new int [nums2.length];
        int top=-1;
        for(int i=nums2.length-1;i>=0;i--){
            if(map.containsKey(nums2[i])){
                if(top==-1){
                    nums1[map.get(nums2[i])]=-1;
                    arr[++top]=nums2[i];
                }else{
                    while(true){
                        if(top==-1){
                            nums1[map.get(nums2[i])]=-1;
                            arr[++top]=nums2[i];
                            break;
                        }
                        else if(arr[top]>nums2[i]){
                            nums1[map.get(nums2[i])]=arr[top];
                            arr[++top]=nums2[i];
                            break;
                        }else{
                            top--;
                        }
                    }
                }
            }else{
                arr[++top]=nums2[i];
            }
        }
        return nums1;
    }
}