class Solution(object):
    def countBinarySubstrings(self, s):
        n = len(s)
        lst = []
        k = 0
        count = 0
        for i in range(1,n):
            if s[i] != s[i-1]:
                lst.append(s[k:i])
                k = i
        lst.append(s[k:])
        for i in range(1,len(lst)):
            if lst[i-1][0] != lst[i][0]:
                m = len(lst[i-1])
                n = len(lst[i])
                count += min(m,n)
        return count