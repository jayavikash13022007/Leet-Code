class Solution(object):
    def longestPalindrome(self, s):
        dic = {}
        lst = []
        flag = 0
        total = 0
        for i in s:
            try:
                dic[i] += 1
            except:
                dic[i] = 1
                lst.append(i)
        for i in lst:
            if dic[i]%2 != 0:
                flag = 1
            total += dic[i]//2 * 2
        return total + flag