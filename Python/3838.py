class Solution(object):
    def mapWordWeights(self, words, weights):
        word = ""
        for i in words:
            total = 0
            for j in i:
                total += weights[ord(j)-97]
            word += chr(122 - total%26)
        return word