class Solution(object):
    def productExceptSelf(self, nums):
        lst1 = [1]
        lst2 = [1]
        lst = []
        n = len(nums)
        for i in range(1,n):
            lst1.append(lst1[-1]*nums[i-1])
        for i in range(n-2,-1,-1):
            lst2.insert(0,lst2[0]*nums[i+1])
        for i in range(n):
            lst.append(lst1[i]*lst2[i])
        return lst