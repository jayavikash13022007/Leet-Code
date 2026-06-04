class Solution(object):
    def totalWaviness(self, num1, num2):
        if num2<100:
            return 0
        total = 0
        for i in range(num1,num2+1):
            for j in range(len(str(i))-2):
                a,b,c = int((str(i))[j]),int((str(i))[j+1]),int((str(i))[j+2])
                if (b>a and b>c) or (b<a and b<c):
                    total += 1
        return total