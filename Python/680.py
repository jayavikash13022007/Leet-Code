class Solution(object):
    def validPalindrome(self, s):
        n = len(s)
        i = 0
        j = n-1
        count = 0
        while i<j:
            if s[i] != s[j]:
                if s[i+1] == s[j]:
                    count += 1
                    i += 1
                elif s[i] == s[j-1]:
                    count += 1
                    j -= 1
                else:
                    count = 2
                    break
            i += 1
            j -= 1
        if count <= 1:
            return True
        i = 0
        j = n-1
        count = 0
        while i<j:
            if s[i] != s[j]:
                if s[i] == s[j-1]:
                    count += 1
                    j -= 1
                elif s[i+1] == s[j]:
                    count += 1
                    i += 1
                else:
                    count = 2
                    break
            i += 1
            j -= 1
        if count <= 1:
            return True
        return False