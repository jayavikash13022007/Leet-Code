class Solution(object):
    def nextGreaterElements(self, nums):
        lst = []
        for i in range(len(nums)):
            lst.append(loop(i,nums))
        return lst
def loop(i,nums):
    for j in range(i+1,len(nums)):
        if nums[j] > nums[i]:
            return nums[j]
    for j in range(0,i):
        if nums[j] > nums[i]:
            return nums[j]
    return -1