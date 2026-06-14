class Solution(object):
    def stringMatching(self, words):
        lst = []
        for i in range(len(words)):
            for word in words[:i]+words[i+1:]:
                if words[i] in word and words[i] not in lst:
                    lst.append(words[i])
        return lst