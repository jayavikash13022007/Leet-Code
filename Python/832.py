class Solution(object):
    def flipAndInvertImage(self, image):
        return [[0 if a == 1 else 1 for a in x[::-1]] for x in image]