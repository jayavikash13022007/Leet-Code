class Solution(object):
    def reverseVowels(self, s):
        lst = "aeiouAEIOU"
        left = 0
        right = len(s)-1
        s = list(s)
        while left<right:
            while(left<len(s)):
                if s[left] not in lst:
                    left += 1
                else:
                    break
            while(right>-1):
                if s[right] not in lst:
                    right -= 1
                else:
                    break
            if not left<right:
                break
            s[left],s[right] = s[right],s[left]
            left += 1
            right -= 1
        return "".join(s)