class Solution(object):
    def restoreString(self, s, indices):
        lst = [""]*len(s)
        for i in range(len(s)):
            lst[indices[i]] = s[i]
            print(lst)
        return "".join(lst)