class Solution(object):
    def isAlienSorted(self, words, order):
        d = {u:v for v,u in enumerate(order)}
        for i in range(len(words) - 1):
            str1 = words[i]
            str2 = words[i+1]
            n = min(len(str1),len(str2))
            if str1[:n] == str2[:n]:
                if len(str2) >= len(str1):
                    continue
                else:
                    return False
            for j in range(n):
                if d[str1[j]] > d[str2[j]]:
                    return False
                if d[str1[j]] < d[str2[j]]:
                    break
        return True