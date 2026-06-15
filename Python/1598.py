class Solution(object):
    def minOperations(self, logs):
        count = 0
        for i in logs:
            if i == "./":
                continue
            elif i == "../":
                count = max(count-1,0)
            else:
                count += 1
        return count