class Solution(object):
    def longestCommonPrefix(self, strs):
        it = min(len(i) for i in strs)
        l = len(strs)
        length = 0
        for i in range(it):
            flag = 1
            for j in range(1,l):
                if strs[j][:i+1] != strs[j-1][:i+1]:
                    flag = 0
                    break
            length += flag
            if flag == 0:
                break
        return strs[0][:length]