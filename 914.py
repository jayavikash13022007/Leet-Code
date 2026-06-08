class Solution(object):
    def hasGroupsSizeX(self, deck):
        lst = list(map(deck.count,deck))
        a = min(lst)
        if a == 1:
            return False
        for i in range(2,a+1):
            flag = 0
            for j in lst:
                if j%i != 0:
                    flag = 1
            if flag == 0:
                return True
        return False