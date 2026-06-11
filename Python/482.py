class Solution(object):
    def licenseKeyFormatting(self, s, k):
        s = "".join([x.upper() for x in s if x != "-"])
        n = len(s)
        word = s[:n%k]
        count = k if len(word) != 0 else 0
        for i in s[n%k:]:
            if count == k:
                word += "-"
                count = 0
            word += i
            count += 1
        return word