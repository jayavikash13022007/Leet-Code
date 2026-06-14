class Solution(object):
    def balancedStringSplit(self, s):
        r = 0
        l = 0
        count = 0
        for i in range(len(s)):
            if s[i] == "R":
                r += 1
            else:
                l += 1
            if r == l:
                count += 1
                r = 0
                l = 0
        return count