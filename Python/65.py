class Solution(object):
    def isNumber(self, s):
        if s.lower() in "-infinity+infinitynan":
            return False
        try:
            a = float(s)
            return True
        except:
            return False