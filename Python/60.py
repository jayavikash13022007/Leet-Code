class Solution(object):
    def getPermutation(self, n, k):
        lst = recurse("",[],"".join(map(str,range(1,n+1))),k)
        return lst[k-1]
def recurse(current,lst,word,k):
    if len(word) == 0:
        lst.append(current)
        return lst
    for i in range(len(word)):
        lst = recurse(current + word[i],lst,word[:i]+word[i+1:],k)
        if len(lst) == k:
            break
    return lst