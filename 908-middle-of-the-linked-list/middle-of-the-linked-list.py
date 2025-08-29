# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        f=head
        s=head
        while s!=None and s.next!=None:
            f=f.next
            s=s.next.next
        return f
        