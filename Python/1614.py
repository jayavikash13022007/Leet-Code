class Solution(object):
    def maxDepth(self, s):
        max_,count = 0,0
        for i in s:
            if i == '(':
                count += 1
                max_ = max(max_,count)
            elif i == ')':
                count -= 1
        return max_