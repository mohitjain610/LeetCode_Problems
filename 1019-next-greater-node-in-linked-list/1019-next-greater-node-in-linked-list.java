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
    public int[] nextLargerNodes(ListNode head) {
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int [] arr=new int[c];
        Stack<Integer> st=new Stack<>();
        Stack<Integer> p=new Stack<>();
        st.push(head.val);
        p.push(0);
        temp=head.next;
        int a=0;
        while(temp!=null){
            if(st.size()!=0 && temp.val>st.peek()){
                arr[p.peek()]=temp.val;
                st.pop();
                p.pop();
                
            }else{
                st.push(temp.val);
                a++;
                p.push(a);
                temp=temp.next;
            }
        }
        return arr;
    }
}