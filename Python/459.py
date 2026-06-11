class Solution(object):
    def repeatedSubstringPattern(self, s):
        for i in range(1,len(s)//2 + 1):
            if s[:i] == s[i:2*i]:
                word = s[:i]
                n = len(word)
                if len(s)%n != 0:
                    continue
                count = 0
                for j in range(len(s)//n):
                    if s[j*n:n + j*n] == word:
                        count += 1
                if j+1 == count:
                    return True
        return False