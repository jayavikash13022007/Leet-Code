class Solution(object):
    def repeatedNTimes(self, nums):
        max_ = 0
        d = {}
        for i in nums:
            try:
                d[i] += 1
            except:
                d[i] = 1
            if d[i] > 1:
                return i