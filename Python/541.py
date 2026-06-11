class Solution(object):
    def reverseStr(self, s, k):
        lst = []
        word = ""
        for i in range(0,len(s),k):
            lst.append(s[i:k + i])
        for i in range(0,len(lst)):
            if i%2 == 1:
                word += lst[i]
            else:
                word += lst[i][::-1]
        return word