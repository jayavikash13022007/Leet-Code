class Solution(object):
    def searchRange(self, nums, target):
        return [-1,-1] if target not in nums else [nums.index(target),len(nums) - nums[::-1].index(target) - 1]