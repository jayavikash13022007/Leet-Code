class Solution(object):
    def findRelativeRanks(self, score):
        lst = [0 for i in score]
        for i in range(1,len(score)+1):
            idx = score.index(max(score))
            if i == 1:
                lst[idx] = "Gold Medal"
            elif i == 2:
                lst[idx] = "Silver Medal"
            elif i == 3:
                lst[idx] = "Bronze Medal"
            else:
                lst[idx] = str(i)
            score[idx] = -1
        return lst