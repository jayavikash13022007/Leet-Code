class Solution(object):
    def findPeakElement(self, nums):
        nums = [-float("inf")] + nums + [-float("inf")]
        left = 1
        right = len(nums) - 2
        while left <= right:
            mid = left + (right - left)//2
            if max(nums[mid-1:mid+2]) == nums[mid]:
                return mid - 1
            if nums[mid-1] > nums[mid]:
                right = mid - 1
            else:
                left = mid + 1