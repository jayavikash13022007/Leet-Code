class Solution(object):
    def lengthOfLastWord(self, s):
        s = s.strip().split()
        l = [len(i) for i in s][-1]
        return l