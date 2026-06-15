class Solution(object):
    def reorderSpaces(self, text):
        n = text.count(" ")
        text = text.split()
        word = text[0]
        if len(text) == 1:
            return word + " "*n
        for i in text[1:]:
            word += " "*(n//(len(text)-1)) + i
        word += " "*(n%(len(text)-1))
        return word