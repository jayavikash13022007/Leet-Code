class Solution(object):
    def findOcurrences(self, text, first, second):
        lst = []
        text = text.split()
        for i in range(2,len(text)):
            if text[i-2] == first and text[i-1] == second:
                lst.append(text[i])
        return lst