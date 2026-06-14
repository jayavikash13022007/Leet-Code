class Solution(object):
    def countCharacters(self, words, chars):
        total = 0
        for i in words:
            d = {}
            for j in i:
                try:
                    d[j] += 1
                except:
                    d[j] = 1
            flag = 1
            for u,v in d.items():
                if chars.count(u) < v:
                    flag = 0
                    break
            if flag == 1:
                total += len(i)
        return total