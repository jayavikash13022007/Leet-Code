class Solution(object):
    def findMaxAverage(self, nums, k):
        max_ = sum(nums[:k])
        total = sum(nums[:k])
        for i in range(len(nums)-k):
            total = total + nums[i+k] - nums[i]
            if total > max_:
                max_ = total
        return float(max_)/k