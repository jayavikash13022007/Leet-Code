class Solution(object):
    def transpose(self, matrix):
        m,n = len(matrix),len(matrix[0])
        lst = [[0]*m for i in range(n)]
        for i in range(m):
            for j in range(n):
                lst[j][i] = matrix[i][j]
        return lst