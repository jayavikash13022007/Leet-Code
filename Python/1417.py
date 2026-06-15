class Solution(object):
    def reformat(self, s):
        word = ""
        letter = [x for x in s if x.isalpha()]
        number = [x for x in s if x.isdigit()]
        if abs(len(letter) - len(number)) > 1:
            return ""
        if len(letter) > len(number):
            for i in range(len(number)):
                word += letter[i] + number[i]
            word += letter[-1]
        else:
            for i in range(len(letter)):
                word += number[i] + letter[i]
            if len(number) != len(letter):
                word += number[-1]
        return word