class Solution(object):
    def shortestPalindrome(self, s):
        left = 0
        if s == s[::-1]:
            return s
        for right in range(len(s)-1,-1,-1):
            if s[left] == s[right]:
                left += 1
        return s[len(s)-1:left-1:-1] + self.shortestPalindrome(s[:left]) + s[left:]