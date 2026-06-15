class Solution(object):
    def makeGood(self, s):
        flag = 1
        while flag:
            flag = 0
            i = 0
            while i < len(s)-1:
                if abs(ord(s[i])-ord(s[i+1])) == 32:
                    s = s[:i] + s[i+2:]
                    flag = 1
                else:
                    i += 1
        return s