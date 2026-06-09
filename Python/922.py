class Solution(object):
    def sortArrayByParityII(self, nums):
        a = [x for x in nums if x%2 == 0]
        b = [x for x in nums if x%2 != 0]
        lst = []
        for i in range(len(a)):
            lst += [a[i],b[i]]
        return lst