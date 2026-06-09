class Solution(object):
    def shortestCompletingWord(self, licensePlate, words):
        min_ = float("inf")
        string = ""
        lst = [x.lower() for x in licensePlate if x.lower() in "abcdefghijklmnopqrstuvwxyz"]
        licensePlate = "".join(lst)
        s  = list(set(lst))
        d = {}
        for i in s:
            d[i] = lst.count(i)
        for a in words:
            flag = 2
            for i in s:
                if d[i] > a.count(i):
                    flag = 0
                    break
            if flag:
                if len(a) < min_:
                    min_ = len(a)
                    string = a
        return string