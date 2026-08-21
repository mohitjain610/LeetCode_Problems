/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int [][]arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=-1;
            }
        }
        ListNode temp=head;
        int a1=0,a2=m-1,b1=0,b2=n-1;
        for(int i=0;temp!=null;i++){
            for(int j=b1;j<=b2;j++){
                if(temp!=null){
                    arr[a1][j]=temp.val;
                    temp=temp.next;
                }
            }
            for(int j=a1+1;j<a2;j++){
                if(temp!=null){
                    arr[j][b2]=temp.val;
                    temp=temp.next;
                }
            }
            for(int j=b2;j>=b1;j--){
                if(temp!=null){
                    arr[a2][j]=temp.val;
                    temp=temp.next;
                }
            }
            for(int j=a2-1;j>a1;j--){
                if(temp!=null){
                    arr[j][b1]=temp.val;
                    temp=temp.next;
                }
            }
            a1++;
            a2--;
            b1++;
            b2--;
        }
        return arr;
    }
}