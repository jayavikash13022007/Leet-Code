class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        num = len(flowerbed)
        if num<3:
            count_ = 1 if flowerbed.count(0) == num else 0
            return n <= count_
        count_ = 0
        for i in range(num):
            if i == 0:
                if flowerbed[i:i+2].count(0) == 2:
                    count_ += 1
                    flowerbed[i] = 1
            elif i == num-1:
                if flowerbed[i-1:].count(0) == 2:
                    count_ += 1
                    flowerbed[i] = 1
            else:
                if flowerbed[i-1:i+2].count(0) == 3:
                    count_ += 1
                    flowerbed[i] = 1
        return n <= count_