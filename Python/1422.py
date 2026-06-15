class Solution(object):
    def maxScore(self, s):
        max_ = 0
        for i in range(1,len(s)):
            max_ = max(max_, s[:i].count("0") + s[i:].count("1"))
        return max_