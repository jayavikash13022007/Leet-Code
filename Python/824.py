class Solution(object):
    def toGoatLatin(self, sentence):
        vowel = "aeiouAEIOU"
        sentence = sentence.split()
        word = ""
        for i in range(len(sentence)):
            if sentence[i][0] in vowel:
                word += sentence[i]
            else:
                word += sentence[i][1:] + sentence[i][0]
            word += "ma" + "a"*(i+1)
            if i != len(sentence)-1:
                word += " "
        return word