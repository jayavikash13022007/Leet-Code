class Solution(object):
    def gcdOfStrings(self, str1, str2):
        word = min([str1,str2],key = len)
        ans = ""
        for i in range(1,len(word)+1):
            a = len(str1)/i
            b = len(str2)/i
            if word[:i]*a == str1 and word[:i]*b == str2:
                ans = word[:i]
        return ans