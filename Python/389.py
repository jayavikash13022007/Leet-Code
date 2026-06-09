class Solution(object):
    def findTheDifference(self, s, t):
        s,t = list(s),list(t)
        for i in s:
            t.remove(i)
        return t[0]