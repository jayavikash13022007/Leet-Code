class Solution(object):
    def numberOfLines(self, widths, s):
        line = 1
        pixel = 0
        for i in s:
            value = widths[ord(i)-97]
            if pixel + value <= 100:
                pixel += value
            else:
                line += 1
                pixel = value
        return [line,pixel]