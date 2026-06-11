class Solution(object):
    def detectCapitalUse(self, word):
        return True if word == word.lower() or word == word.upper() or word == word.capitalize() else False