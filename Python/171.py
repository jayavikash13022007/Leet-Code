class Solution(object):
    def titleToNumber(self, columnTitle):
        num = 0
        for i in columnTitle:
            num = num*26 + ord(i) - 64
        return num