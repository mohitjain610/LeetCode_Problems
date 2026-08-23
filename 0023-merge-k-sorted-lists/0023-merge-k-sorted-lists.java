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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        ListNode temp=lists[0];
        int c=0;
        while(c<lists.length){
            if(lists[c]==null){
                c++;
            }else{
                temp=lists[c];
                break;
            }
        }
        ListNode head=temp;
        for(int i=c+1;i<lists.length;i++){
            ListNode current=lists[i],prev=null;
            temp=head;
            while(temp!=null && current!=null){
                if(current.val<=head.val){
                    ListNode nex=current.next;
                    current.next=head;
                    head=current;
                    temp=current;
                    current=nex;
                }else if(current.val<=temp.val){
                    ListNode nex=current.next;
                    current.next=temp;
                    prev.next=current;
                    prev=current;
                    current=nex;
                }else{
                    prev=temp;
                    temp=temp.next;
                }
            }
            if(current!=null){
                prev.next=current;
            }
        }
        return head;
    }
}