class Solution(object):
    def generateParenthesis(self, n):
        lst = recurse(n-1,"()",[])
        return lst
def recurse(n,current,lst):
    if n==0:
        if current not in lst:
            lst.append(current)
        return lst
    for i in range(len(current)+1):
        lst = recurse(n-1,current[:i] + "()" + current[i:],lst)
    return lst