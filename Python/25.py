class Solution(object):
    def reverseKGroup(self, head, k):
        lst = []
        while(head):
            lst.append(head.val)
            head = head.next
        arr = []
        for i in range(0,len(lst)//k * k,k):
            arr += lst[i:i+k][::-1]
        arr += lst[i+k:]
        root = ListNode(arr[0])
        a = root
        if len(arr) == 0:
            return None
        for i in arr[1:]:
            a.next = ListNode(i)
            a = a.next
        return root