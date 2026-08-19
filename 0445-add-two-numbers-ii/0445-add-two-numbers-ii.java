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
        ListNode prev=null,current=head;
        while(current!=null){
            ListNode nex=current.next;
            current.next=prev;
            prev=current;
            current=nex;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=reverse(l1);
        ListNode head2=reverse(l2);
        int carry=0;
        ListNode dummynode=new ListNode();
        ListNode temp1=head1,temp2=head2,temp3=dummynode;
        while(temp1!=null && temp2!=null){
            int r=(temp1.val+temp2.val+carry)%10;
            ListNode newnode=new ListNode(r);
            carry=(temp1.val+temp2.val+carry)/10;
            temp3.next=newnode;
            temp1=temp1.next;
            temp2=temp2.next;
            temp3=temp3.next;
        }
        while(temp1!=null){
            int r=(temp1.val+carry)%10;
            ListNode newnode=new ListNode(r);
            carry=(temp1.val+carry)/10;
            temp3.next=newnode;
            temp1=temp1.next;
            temp3=temp3.next;
        }
        while(temp2!=null){
            int r=(temp2.val+carry)%10;
            ListNode newnode=new ListNode(r);
            carry=(temp2.val+carry)/10;
            temp3.next=newnode;
            temp2=temp2.next;
            temp3=temp3.next;
        }
        if(carry!=0){
            ListNode newnode=new ListNode(carry);
            temp3.next=newnode;
        }
        return reverse(dummynode.next);
    }
}