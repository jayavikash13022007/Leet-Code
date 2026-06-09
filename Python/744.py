class Solution(object):
    def nextGreatestLetter(self, letters, target):
        lst = list(map(ord,letters))
        value = min([x for x in lst if x > ord(target)]+[10000])
        return letters[0] if value == 10000 else chr(value)