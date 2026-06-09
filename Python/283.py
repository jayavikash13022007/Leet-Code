class Solution(object):
    def moveZeroes(self, nums):
        idx = 0
        for i in range(len(nums)):
            if nums[idx] == 0:
                nums.pop(idx)
                nums.append(0)
            else:
                idx += 1
        return nums