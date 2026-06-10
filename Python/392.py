class Solution(object):
    def isSubsequence(self, s, t):
        if len(s) == 0:
            return True
        k = 0
        for i in t:
            if s[k] == i:
                k += 1
            if k == len(s):
                return True
        return False