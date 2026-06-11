class Solution(object):
    def convertToBase7(self, num):
        if num == 0:
            return "0"
        b = "-" if num < 0 else ""
        a = ""
        num = abs(num)
        while num:
            a = str(num%7) + a
            num //= 7
        return b+a