class Solution(object):
    def isPathCrossing(self, path):
        x,y = 0,0
        lst = [[0,0]]
        for i in path:
            if i == "N":
                y += 1
            elif i == "S":
                y -= 1
            elif i == "E":
                x += 1
            else:
                x -= 1
            if [x,y] in lst:
                return True
            else:
                lst.append([x,y])
        return False