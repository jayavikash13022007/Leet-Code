class Solution(object):
    def imageSmoother(self, img):
        row,col = len(img),len(img[0])
        lst = [[0]*col for i in range(row)]
        for i in range(row):
            for j in range(col):
                arr = [a for b in img[max(i-1,0):min(i+2,row)] for a in b[max(j-1,0):min(j+2,col)]]
                print(arr)
                lst[i][j] = sum(arr)/len(arr)
        return lst