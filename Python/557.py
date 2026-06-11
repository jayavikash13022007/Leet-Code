class Solution(object):
    def reverseWords(self, s):
        lst = [x[::-1] for x in s.split()]
        word = lst[0]
        for i in range(1,len(lst)):
            word += " " + lst[i]
        return word