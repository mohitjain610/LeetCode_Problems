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
    public ListNode reverse(ListNode a,ListNode b){
        ListNode temp=a.next,prev1=null,p=a.next;
        while(temp!=b){
            ListNode nex=temp.next;
            temp.next=prev1;
            prev1=temp;
            temp=nex;
        }
        a.next=prev1;
        p.next=b;
        return p;
    }
    public ListNode reverseEvenLengthGroups(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)return head;
        ListNode a=head,b=head,prev=null;
        int c1=1,c=2,c2=1;
        while(b!=null){
            while(b!=null && c2<=(c+c1)){
                prev=b;
                b=b.next;
                c2++;
            }
            if((c2-c1-1)%2==0){
                prev=reverse (a,b);
            }
            c++;
            if(b==null)break;
            a=prev;
            b=prev;
            c2=c2-1;
            c1=c2;

        }
        return head;
    }
}