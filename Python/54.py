class Solution(object):
    def spiralOrder(self, matrix):
        d = {}
        d["up"] = 1
        d["down"] = len(matrix) - 1
        d["left"] = 0
        d["right"] = len(matrix[0]) - 1
        i = 0
        j = 0
        lst = []
        key = "right"
        k = 0
        while k < len(matrix) * len(matrix[0]):
            if key == "up":
                if i>= d[key]:
                    lst.append(matrix[i][j])
                    i -= 1
                else:
                    d[key] += 1
                    i += 1
                    j += 1
                    key = "right"
                    continue
            elif key == "down":
                if i <= d[key]:
                    lst.append(matrix[i][j])
                    i += 1
                else:
                    d[key] -= 1
                    i -= 1
                    j -= 1
                    key = "left"
                    continue
            elif key == "left":
                if j >= d[key]:
                    lst.append(matrix[i][j])
                    j -= 1
                else:
                    d[key] += 1
                    j += 1
                    i -= 1
                    key = "up"
                    continue
            else:
                if j <= d[key]:
                    lst.append(matrix[i][j])
                    j += 1
                else:
                    d[key] -= 1
                    j -= 1
                    i += 1
                    key = "down"
                    continue
            k += 1
        return lst