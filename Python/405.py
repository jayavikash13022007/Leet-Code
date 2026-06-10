class Solution(object):
    def toHex(self, num):
        if num == 0:
            return "0"
        num = num if num > -1 else 2**32 + num
        print(num)
        hexa = ""
        string = "0123456789abcdef"
        while(num):
            hexa = (string[num%16]) + hexa
            num//=16
        return hexa