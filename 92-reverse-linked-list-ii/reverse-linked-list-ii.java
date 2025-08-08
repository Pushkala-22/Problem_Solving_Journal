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
    public ListNode reverseBetween(ListNode head, int left, int right) {
         ListNode currNode = head, prevNode = null;
        int i;

        // Move currNode to the position m
        for (i = 1; i < left; i++) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        // Store pointers to the start
        // and end of the reversed segment
        ListNode revHead = currNode;
        ListNode revTail = null;

        // Reverse the linked list from position m to n
        ListNode nextNode;
        while (i <= right) {
            nextNode = currNode.next;
            currNode.next = revTail;
            revTail = currNode;
            currNode = nextNode;
            i++;
        }
        if (prevNode != null) {
            prevNode.next = revTail;
        }
        else {
            head = revTail;
        }
        revHead.next = currNode;
        return head;
    }
}