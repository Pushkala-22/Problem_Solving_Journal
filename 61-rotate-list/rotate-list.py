# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if not head or not head.next or k==0:
            return head
        temp=head
        n=0
        while temp:
            n=n+1
            temp=temp.next
        k=k%n
        for i in range(k):
            temp=head
            prev=None
            while temp.next:
                prev=temp
                temp=temp.next
            prev.next=None
            temp.next=head
            head=temp
        return head



        