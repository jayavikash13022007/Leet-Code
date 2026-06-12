class Solution(object):
    def guessNumber(self, n):
        start = 1
        stop = n
        while True:
            mid = (start + stop)//2
            if guess(mid) == 0:
                return mid
            elif guess(mid) == 1:
                start = mid + 1
            else:
                stop = mid - 1