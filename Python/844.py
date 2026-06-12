class Solution(object):
    def backspaceCompare(self, s, t):
        a = list(s)
        b = list(t)
        s = []
        t = []
        for i in a:
            if i == "#":
                if len(s)>0:
                    s.pop()
            else:
                s.append(i)
        for i in b:
            if i == "#":
                if len(t)>0:
                    t.pop()
            else:
                t.append(i)
        return s==t