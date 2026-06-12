class Solution(object):
    def rotateString(self, s, goal):
        for i in range(len(goal)):
            if goal == (s[i:]+s[0:i]):
                return True
        return False