class Solution(object):
    def threeSum(self, nums):
        lst = []
        nums.sort()
        for i in range(len(nums)):
            left,right = i+1,len(nums)-1
            while(left < right):
                total = nums[i] + nums[left] + nums[right]
                if total == 0 and [nums[i],nums[left],nums[right]] not in lst:
                    lst.append([nums[i],nums[left],nums[right]])
                    left += 1
                    right -= 1
                else:
                    if total >= 0:
                        right -= 1
                    else:
                        left += 1
        return lst