class Solution(object):
    def removeOuterParentheses(self, s):
        k = 0
        word = ""
        lst = []
        for i in range(len(s)):
            if s[i] == "(":
                lst.append(s[i])
            else:
                lst.pop()
            if len(lst) == 0:
                word += s[k+1:i]
                k = i+1
        return word