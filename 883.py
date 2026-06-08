class Solution(object):
    def projectionArea(self, grid):
        lst = [x for a in grid for x in a if x>0]
        a = len(lst)
        lst = [max(x) for x in grid]
        b = sum(lst)
        lst = [max([x[i] for x in grid]) for i in range(len(grid[0]))]
        c = sum(lst)
        return a+b+c