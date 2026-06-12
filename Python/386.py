class Solution(object):
    def lexicalOrder(self, n):
        return [int(x) for x in sorted([str(x) for x in list(range(1,n+1))])]