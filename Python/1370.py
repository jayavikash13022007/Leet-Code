class Solution(object):
    def sortString(self, s):
        res = ""
        s = list(s)
        while s:
            s.sort()
            res += s[0]
            i = 0
            s.pop(0)
            while i < len(s):
                if s[i] != res[-1]:
                    res += s[i]
                    s.pop(i)
                else:
                    i += 1
            s.sort(reverse = True)
            if len(s) == 0:
                break
            res += s[0]
            i = 0
            s.pop(0)
            while i < len(s):
                if s[i] != res[-1]:
                    res += s[i]
                    s.pop(i)
                else:
                    i += 1
        return res