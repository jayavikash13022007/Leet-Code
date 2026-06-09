class Solution(object):
    def surfaceArea(self, grid):
        total = 0
        for i in range(len(grid)):
            for j in range (len(grid[0])):
                if grid[i][j] != 0:
                    total += 6*grid[i][j] - 2*(grid[i][j]-1)
                    if i-1>=0:
                        total -= min(grid[i-1][j],grid[i][j])
                    if i+1<len(grid):
                        total -= min(grid[i+1][j],grid[i][j])
                    if j-1>=0:
                        total -= min(grid[i][j-1],grid[i][j])
                    if j+1<len(grid[0]):
                        total -= min(grid[i][j+1],grid[i][j])
        return total