class Solution(object):
    def maxPower(self, s):
        max_ = 0
        k = 0
        for i in range(1,len(s)):
            if s[i] != s[i-1]:
                max_ = max(max_,i-k)
                k = i
        return max(max_,len(s)-k)