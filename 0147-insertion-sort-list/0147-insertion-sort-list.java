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
    public ListNode insertionSortList(ListNode head) {
       ListNode temp=head.next,prev1=head;
       while(temp!=null){
            if(temp.val<=head.val){
                ListNode nex=temp.next;
                temp.next=head;
                prev1.next=nex;
                head=temp;
                temp=nex;
            }else if(temp.val>head.val && temp.val>prev1.val){
                prev1=temp;
                temp=temp.next;
            }else{
                ListNode current=head.next,prev2=head;
                while(current!=temp){
                    if(current.val>=temp.val){
                        ListNode nex=temp.next;
                        temp.next=current;
                        prev2.next=temp;
                        prev1.next=nex;
                        temp=nex;
                        break;
                    }else{
                        prev2=current;
                        current=current.next;
                    }

                }
            }
       }
       return head; 
    }
}