class Solution(object):
    def isHappy(self, n):
        lst = []
        while n != 1:
            if n in lst:
                return False
            else:
                lst.append(n)
            val = 0
            while n:
                val += (n%10)**2
                n/=10
            n = val
        return True
