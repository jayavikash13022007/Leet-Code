class Solution(object):
    def addToArrayForm(self, num, k):
        nums = 0
        for i in num:
            nums = nums*10 + i
        return list(map(int,str(nums + k)))