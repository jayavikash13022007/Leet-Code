class Solution(object):
    def dayOfYear(self, date):
        year,month,day = map(int,date.split("-"))
        lst = [31,28,31,30,31,30,31,31,30,31,30]
        count = day
        for i in range(month-1):
            count += lst[i]
        if year%4 == 0 and year != 1900 and month>2:
            count += 1
        return count