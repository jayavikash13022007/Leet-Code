class Solution(object):
    def maxNumberOfBalloons(self, text):
        count = 0
        text = list(text)
        while True:
            for i in "balloon":
                try:
                    text.remove(i)
                except:
                    return count
            count += 1