class Solution(object):
    def sortArrayByParity(self, nums):
        a = [x for x in nums if x%2 == 0]
        b = [x for x in nums if x%2 != 0]
        return a+b
        