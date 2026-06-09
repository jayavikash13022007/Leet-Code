class Solution(object):
    def mostCommonWord(self, paragraph, banned):
        lst = [x for x in "".join([x.lower() if x.lower() in "abcdefghijklmnopqrstuvwxyz " else " " for x in paragraph]).split() if x not in banned]
        return max(list(set(lst)),key = lst.count)