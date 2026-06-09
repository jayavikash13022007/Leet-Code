class Solution(object):
    def isPalindrome(self, s):
        s = "".join([x.lower() for x in s if x.lower() in "abcdefghijklmnopqrstuvwxyz1234567890"])
        return s == s[::-1]