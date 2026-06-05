class Solution(object):
    def findErrorNums(self, nums):
        lst=[0,0]
        nums.sort()
        for i in range(len(nums)):
            if i+1 not in nums:
                lst[1] = i+1
            if i!=0 and nums[i] == nums[i-1]:
                lst[0] = nums[i]
        return lst