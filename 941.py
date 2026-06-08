class Solution(object):
    def validMountainArray(self, arr):
        if len(arr) < 3:
            return False
        n = len(arr) - 1
        inc,dec = 0,0
        for i in range(1,len(arr)):
            if arr[i] > arr[i-1]:
                inc += 1
            else:
                break
        for j in range(i,len(arr)):
            if arr[j] < arr[j-1]:
                dec += 1
            else:
                return False
        return False if min(inc,dec,inc+dec == n) == 0 else True