class Solution(object):
    def distributeCandies(self, candyType):
        count = len(candyType)/2
        lst = list(set(candyType))
        total = len(lst)
        return min(count,total)