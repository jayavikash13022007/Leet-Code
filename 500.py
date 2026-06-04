class Solution(object):
    def findWords(self, words):
        letter = ["qwertyuiop","asdfghjkl","zxcvbnm"]
        lst = []
        for a in words:
            i = a.lower()
            temp = -1
            for j in i:
                for k in range(3):
                    if j in letter[k]:
                        if temp == -1:
                            temp = k
                        else:
                            if temp != k:
                                temp = -1
                                break
                if temp == -1:
                    break
            if temp != -1:
                lst.append(a)
        return lst