class Solution(object):
    def findLengthOfLCIS(self, nums):
        high = 1
        max_ = 1
        for i in range(1,len(nums)):
            if nums[i] > nums[i-1]:
                max_ += 1
                high = max(high,max_)
            else:
                max_ = 1
        return high