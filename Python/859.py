class Solution(object):
    def buddyStrings(self, s, goal):
        if goal == s:
            if len(s) != len(list(set(s))):
                return True
            else:
                return False
        if len(s) != len(goal):
            return False
        count = 0
        k = 0
        for i in range(len(s)):
            if s[i] != goal[i]:
                if count == 0:
                    k = i
                    count += 1
                else:
                    break
        word = s[:k] + s[i] + s[k+1:i] + s[k] + s[i+1:]
        return word == goal