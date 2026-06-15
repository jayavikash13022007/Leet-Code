class Solution(object):
    def plusOne(self, digits):
        a = ""
        for i in digits:
            a += str(i)
        a = str(int(a) + 1)
        lst = []
        for i in a:
            lst.append(int(i))
        return lst