class Solution(object):
    def pivotIndex(self, nums):
        idx = -1
        left = 0
        right = sum(nums)
        for i in range(len(nums)):
            right -= nums[i]
            if left == right:
                idx = i
                return idx
            left += nums[i]
        return idx