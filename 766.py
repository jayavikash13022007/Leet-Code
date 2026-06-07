class Solution(object):
    def isToeplitzMatrix(self, matrix):
        m,n = len(matrix),len(matrix[0])
        for i in range(m):
            a,b = i,0
            value = matrix[a][b]
            while True:
                a += 1
                b += 1
                try:
                    if matrix[a][b] != value:
                        return False
                except:
                    break
        for j in range(1,n):
            a,b = 0,j
            value = matrix[a][b]
            while True:
                a += 1
                b += 1
                try:
                    if matrix[a][b] != value:
                        return False
                except:
                    break
        return True