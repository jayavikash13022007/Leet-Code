class Solution(object):
    def sortedSquares(self, nums):
        lst = []
        for i in nums:
            lst.append(i**2)
        return sorted(lst)