class Solution(object):
    def removeElement(self, nums, val):
        a = nums.count(val)
        for i in range(a):
            nums.remove(val)
        return len(nums)
        