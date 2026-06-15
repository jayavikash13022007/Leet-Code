# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteMiddle(self, head):
        lst = []
        n = 0
        a = head
        while(a != None):
            n += 1
            a = a.next
        if n == 1:
            return None
        mid = n//2
        a = head
        for i in range(n):
            if i+1 == mid:
                a.next = a.next.next
                break
            a = a.next
        return head