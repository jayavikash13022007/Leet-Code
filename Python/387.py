class Solution(object):
    def firstUniqChar(self, s):
        letter = []
        idx = []
        d = {}
        for i in range(len(s)):
            try:
                d[s[i]] += 1
            except:
                d[s[i]] = 1
                letter.append(s[i])
                idx.append(i)
        for i in range(len(letter)):
            if d[letter[i]] == 1:
                return idx[i]
        return -1