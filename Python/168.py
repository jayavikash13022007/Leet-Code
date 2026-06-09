class Solution(object):
    def convertToTitle(self, columnNumber):
        s = ""
        while(columnNumber):
            s = chr((columnNumber-1)%26 + 65) + s
            columnNumber -= 26 if s[0] == 'Z' else 0
            columnNumber /= 26
        return s