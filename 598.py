class Solution(object):
    def maxCount(self, m, n, ops):
        j,k = m,n
        for i in ops:
            a,b = i
            if j > a:
                j = a
            if k > b:
                k = b
        return j * k