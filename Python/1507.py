class Solution(object):
    def reformatDate(self, date):
        if date[1].isalpha():
            date = "0" + date
        d = {"Jan":"01", "Feb":"02", "Mar":"03", "Apr":"04", "May":"05", "Jun":"06", "Jul":"07", "Aug":"08", "Sep":"09", "Oct":"10", "Nov":"11", "Dec":"12"}
        return date[9:] + "-" + d[date[5:8]] + "-" + date[:2]