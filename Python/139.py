class Solution(object):
    def wordBreak(self, s, wordDict):
        dp = [True] + [False]*len(s)
        for i in range(1,len(s) + 1):
            for j in range(i):
                if dp[j] and s[j:i] in wordDict:
                    dp[i] = True
                    break
        return dp[len(s)]