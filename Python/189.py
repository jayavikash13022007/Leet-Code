class Solution(object):
    def rotate(self, nums, k):
        lst = []
        n = len(nums)
        k = k%n
        for i in range(n-k,n):
            lst.append(nums[i])
        for i in range(n-k-1,-1,-1):
            nums[i+k] = nums[i]
        for i in range(k):
            nums[i] = lst[i]