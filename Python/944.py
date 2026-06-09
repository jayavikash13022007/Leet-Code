class Solution(object):
    def minDeletionSize(self, strs):
        count = 0
        for i in range(len(strs[0])):
            lst = []
            for j in range(len(strs)):
                lst.append(strs[j][i])
            if lst != sorted(lst):
                count += 1
        return count