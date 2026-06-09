class Solution(object):
    def findShortestSubArray(self, nums):
        min_ = float("inf")
        d = {}
        lst =[]
        high = 0
        for i in nums:
            try:
                d[i] += 1
            except:
                d[i] = 1
            if d[i] > high:
                high = d[i]
                lst = [i]
            if d[i] == high:
                lst.append(i)
        for i in lst:
            value = len(nums) - nums[::-1].index(i) - nums.index(i)
            min_ = min(value,min_)
        return min_