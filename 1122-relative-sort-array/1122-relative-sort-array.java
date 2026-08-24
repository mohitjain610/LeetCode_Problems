class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int  [] arr=new int[1001];
        for(int n:arr1){
            arr[n]++;
        }
        int k=0;
        for(int i=0;i<arr2.length;i++){
            int a=arr[arr2[i]];
            for(int j=0;j<a;j++){
                arr1[k]=arr2[i];
                k++;
                arr[arr2[i]]--;
            }
        }
        for(int i=0;i<1001;i++){
            if(arr[i]>0){
                int b=arr[i];
                for(int j=0;j<b;j++){
                arr1[k]=i;
                k++;
                arr[i]--;
                }
            }
        }
        return arr1;
    }
}