class Solution(object):
    def shortestToChar(self, s, c):
        n = len(s)
        lst = []
        for i in range(n):
            lst.append(min(s[i::-1].index(c) if c in s[i::-1] else float("inf"),s[i:].index(c) if c in s[i:] else float("inf")))
        return lst