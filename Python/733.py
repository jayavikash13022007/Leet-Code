class Solution(object):
    def floodFill(self, image, sr, sc, color):
        m,n = len(image),len(image[0])
        c = image[sr][sc]
        if c == color:
            return image
        image[sr][sc] = color
        flood(sr,sc,color,c,image,m,n)
        return image
def flood(i,j,color,c,image,m,n):
    if i-1 >= 0:
        if image[i-1][j] == c:
            image[i-1][j] = color
            flood(i-1,j,color,c,image,m,n)
    if i+1 < m:
        if image[i+1][j] == c:
            image[i+1][j] = color
            flood(i+1,j,color,c,image,m,n)
    if j-1 >= 0:
        if image[i][j-1] == c:
            image[i][j-1] = color
            flood(i,j-1,color,c,image,m,n)
    if j+1 < n:
        if image[i][j+1] == c:
            image[i][j+1] = color
            flood(i,j+1,color,c,image,m,n)