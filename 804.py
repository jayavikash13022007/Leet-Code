class Solution(object):
    def uniqueMorseRepresentations(self, words):
        morsecode = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        lst = []
        for i in words:
            word = ""
            for j in i:
                word += morsecode[ord(j)-97]
            lst.append(word)
        return len(list(set(lst)))