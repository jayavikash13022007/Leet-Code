class Solution(object):
    def maxProfit(self, prices):
        Max = 0
        total = 0
        Min = prices[0]
        for i in range(1,len(prices)):
            total = prices[i] - Min
            if total > Max:
                Max = total
            if prices[i] < Min:
                Min = prices[i]
        return Max