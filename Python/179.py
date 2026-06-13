class Solution(object):
    def largestNumber(self, nums):
        n = len(nums)
        max_ = ""
        nums = list(map(str,nums))
        for i in range(n):
            idx = 0
            val = nums[0]
            for j in range(1,len(nums)):
                if nums[j] + val > val + nums[j]:
                    val = nums[j]
            nums.remove(val)
            max_ += val
        return str(int(max_))