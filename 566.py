class Solution(object):
    def matrixReshape(self, mat, r, c):
        row = len(mat)
        col = len(mat[0])
        if row*col != r*c:
            return mat
        l = [[0]*c for i in range(r)]
        for i in range(row):
            for j in range(col):
                sum = i*col + j
                a,b = sum//c,sum%c
                l[a][b] = mat[i][j]
        return l