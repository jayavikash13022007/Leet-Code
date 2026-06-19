class Solution(object):
    def largestAltitude(self, gain):
        max_ = 0
        sum = 0
        for i in gain:
            sum += i
            max_ = max(max_,sum)
        return max_