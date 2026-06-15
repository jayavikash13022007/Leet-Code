class Solution(object):
    def thousandSeparator(self, n):
        word = ""
        l = len(str(n))
        for i in range(l):
            word += str(n)[i]
            if (l-i-1)%3 == 0 and i+1<l:
                word += "."
        return word