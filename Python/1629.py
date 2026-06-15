class Solution(object):
    def slowestKey(self, releaseTimes, keysPressed):
        lst = [releaseTimes[0]]
        for i in range(1,len(releaseTimes)):
            lst.append(releaseTimes[i] - releaseTimes[i-1])
        val = max(lst)
        check = []
        for i in range(len(lst)):
            if lst[i] == val:
                check.append(keysPressed[i])
        return max(check)