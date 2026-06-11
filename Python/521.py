class Solution(object):
    def findLUSlength(self, a, b):
        if a == b:
            return -1
        return len(max(a,b,key = len))