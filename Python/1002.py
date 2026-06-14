class Solution(object):
    def commonChars(self, words):
        if len(words) == 1:
            return list(words[0])
        word = min(words,key = len)
        d = {}
        lst = []
        for i in word:
            try:
                d[i] += 1
            except:
                d[i] = 1
        for u,v in d.items():
            arr = [x.count(u) for x in words[1:]]
            lst += list((min(v,min(arr))) * u)
        return lst