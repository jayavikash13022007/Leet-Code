class Solution(object):
    def countHillValley(self, nums):
        lst = []
        for i in nums:
            if len(lst) == 0:
                lst.append(i)
            if lst[-1]!=i:
                lst.append(i)
        count = 0
        for i in range(1,len(lst)-1):
            if max(lst[i-1],lst[i],lst[i+1]) == lst[i] or min(lst[i-1],lst[i],lst[i+1]) == lst[i]:
                count += 1
        return count