class Solution(object):
    def maxLengthBetweenEqualCharacters(self, s):
        max_ = -1
        for i in range(len(s)):
            max_ = max(max_,len(s) - s[::-1].index(s[i]) - s.index(s[i]) - 2)
        return max_