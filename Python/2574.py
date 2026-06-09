class Solution(object):
    def leftRightDifference(self, nums):
        left = 0
        answer = []
        right = sum(nums)
        for i in nums:
            right -= i
            answer.append(abs(left - right))
            left += i
        return answer