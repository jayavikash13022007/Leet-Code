# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def pairSum(self, head):
        lst = []
        while(head):
            lst.append(head.val)
            head = head.next
        max_ = -float("inf")
        n = len(lst)
        for i in range(n//2):
            if lst[i] + lst[n-i-1] > max_:
                max_ = lst[i] + lst[n-i-1]
        return max_