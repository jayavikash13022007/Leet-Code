class Solution(object):
    def strStr(self, haystack, needle):
        return -1 if needle not in haystack else haystack.index(needle)