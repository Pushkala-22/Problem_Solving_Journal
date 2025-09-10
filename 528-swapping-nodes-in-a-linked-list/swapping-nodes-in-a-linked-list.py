# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapNodes(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if head==None or head.next==None or k==0:
            return head
        temp=tail=head
        l=0
        prev=None
        while temp:
            l=l+1
            temp=temp.next
        temp=head
        if k>l:
            return head
        for i in range(k-1):
            temp=temp.next
        for i in range(l-k):
            tail=tail.next
        prev=temp.val
        temp.val=tail.val
        tail.val=prev
        return head
