class Solution(object):
    def kthSmallest(self, matrix, k):
        lst = sorted([x for arr in matrix for x in arr])
        return lst[k-1]