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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null ||k==0) return head;
        ListNode tail=head;
        int l=1;
        while(tail.next!=null){
          l++;
          tail=tail.next;
        }
        k=k%l;
        if(k==0) return head;
        tail.next=head;
        int n=l-k;
        ListNode temp=head;
       for(int i=1;i<n;i++){
        temp=temp.next;
       }
       ListNode nhead=temp.next;
       temp.next=null;
      
        return nhead;
    }
 
}