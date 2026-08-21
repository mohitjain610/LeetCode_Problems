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
    public ListNode reverse(ListNode head){
        ListNode prev=null,temp=head;
        while(temp!=null){
            ListNode nex=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nex;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode big=head,temp=head.next;
        while(temp!=null){
            if(temp.val>=big.val){
                big=temp;
            }else{
                big.next=temp.next;
            }
            temp=temp.next;
        }
        return reverse(head);
    }
}