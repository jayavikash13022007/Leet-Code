class Solution(object):
    def minMoves(self, nums):
        a = min(nums)
        total = 0
        for i in nums:
            total += i - a
        return total