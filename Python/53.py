class Solution(object):
    def maxSubArray(self, nums):
        cur = nums[0]
        tot = nums[0]
        for i in nums[1:]:
            cur = max(i,i+cur)
            tot = max(tot,cur)
        return tot