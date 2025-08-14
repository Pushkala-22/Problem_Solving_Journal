/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         ListNode pointerA = headA; // Pointer for traversing the first list
        ListNode pointerB = headB; // Pointer for traversing the second list
      
        // Continue traversing until the two pointers are the same (either at intersection or both null)
        while (pointerA != pointerB) {
            // If we have reached the end of list A, switch to list B; otherwise, move to the next node
            pointerA = (pointerA == null) ? headB : pointerA.next;
            // If we have reached the end of list B, switch to list A; otherwise, move to the next node
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }
      
        // At the end of the traversal, pointerA and pointerB will be either at the intersection node or null
        return pointerA; 
    }
}