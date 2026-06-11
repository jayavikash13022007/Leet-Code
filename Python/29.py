class Solution(object):
    def divide(self, dividend, divisor):
        return min(((abs(dividend)/abs(divisor)) * (-1 if dividend/divisor < 0 else 1)),2147483647) if dividend/divisor >= 0 else max(((abs(dividend)/abs(divisor)) * (-1 if dividend/divisor < 0 else 1)),-2147483648)