class Solution(object):
    def mergeKLists(self, lists):
        lst = []
        for l in lists:
            a = l
            while a != None:
                lst.append(a.val)
                a = a.next
        lst.sort()
        root = ListNode()
        a = root
        if len(lst) > 0:
            a.val = lst[0]
        else:
            return None
        for i in lst[1:]:
            a.next = ListNode(i)
            a = a.next
        return root