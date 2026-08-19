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
    public int numComponents(ListNode head, int[] nums) {
        boolean [] arr=new boolean[10001];
        for(int n:nums){
            arr[n]=true;
        }
        ListNode temp=head;
        int c=0,ans=0;
        while(temp!=null){
            if(!arr[temp.val]){
                if(c>0)ans++;
                c=0;
            }else{
                c++;
            }
            
            temp=temp.next;
        }
        if(c>0)ans++;
        return ans;
    }
}