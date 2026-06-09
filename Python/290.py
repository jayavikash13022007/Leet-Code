class Solution(object):
    def wordPattern(self, pattern, s):
        pattern = list(pattern)
        s = s.split()
        d = {}
        if len(s)!=len(pattern):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in d:
                d[pattern[i]] = s[i]
            else:
                if d[pattern[i]] != s[i]:
                    return False
        d = {}
        for i in range(len(pattern)):
            if s[i] not in d:
                d[s[i]] = pattern[i]
            else:
                if d[s[i]] != pattern[i]:
                    return False
        return True