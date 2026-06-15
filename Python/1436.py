class Solution(object):
    def destCity(self, paths):
        lst1 = [x[0] for x in paths]
        lst2 = [x[1] for x in paths]
        for i in lst2:
            if i not in lst1:
                return i