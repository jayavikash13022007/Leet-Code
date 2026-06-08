class Solution(object):
    def pivotArray(self, nums, pivot):
        a = [x for x in nums if x<pivot]
        b = [x for x in nums if x==pivot]
        c = [x for x in nums if x>pivot]
        return a+b+c