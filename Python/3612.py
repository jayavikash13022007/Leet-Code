class Solution(object):
    def processStr(self, s):
        lst = []
        for i in s:
            if i == '*':
                if lst:
                    lst.pop()
            elif i == '#':
                lst.extend(lst)
            elif i == '%':
                lst.reverse()
            else:
                lst.append(i)
        return "".join(lst)