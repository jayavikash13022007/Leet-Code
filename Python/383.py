class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        for i in "abcdefghijklmnopqrstuvwxyz":
            if magazine.count(i)-ransomNote.count(i) < 0:
                return False
        return True