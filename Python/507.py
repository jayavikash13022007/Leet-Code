class Solution(object):
    def checkPerfectNumber(self, num):
        if num == 1:
            return False
        total = 1
        i = 2
        while(i**2<num):
            if num%i == 0:
                total += i
                total += num/i
            i += 1
        return num == total