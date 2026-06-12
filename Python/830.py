class Solution(object):
    def largeGroupPositions(self, s):
        lst = []
        k = 0
        for i in range(1,len(s)):
            if s[i]!=s[i-1]:
                if i-k >= 3:
                    lst.append([k,i-1])
                k = i
        if len(s)-k >= 3:
            lst.append([k,len(s)-1])
        return lst