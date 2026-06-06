class Solution(object):
    def dominantIndex(self, nums):
        a = max(nums)
        idx = nums.index(a)
        nums.remove(a)
        b = max(nums)
        return idx if a >= 2*b else -1