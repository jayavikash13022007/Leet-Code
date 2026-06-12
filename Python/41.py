class Solution(object):
    def firstMissingPositive(self, nums):
        lst = sorted(list(set([x for x in nums if x>0])))
        if len(lst) == 0:
            return 1
        i = 0
        while True:
            try:
                if lst[i] != i+1:
                    return i+1
                i += 1
            except:
                return i+1