class Solution(object):
    def fairCandySwap(self, aliceSizes, bobSizes):
        a = sum(aliceSizes)
        b = sum(bobSizes)
        for i in aliceSizes:
            total = float(b-a + 2*i)/2
            if total - int(total) == 0 and int(total) in bobSizes:
                return [i,int(total)]