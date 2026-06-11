class Solution(object):
    def fizzBuzz(self, n):
        lst = []
        for i in range(1,n+1):
            string = ""
            if i%3 == 0:
                string += "Fizz"
            if i%5 == 0:
                string += "Buzz"
            lst.append(string if len(string) > 0 else str(i))
        return lst