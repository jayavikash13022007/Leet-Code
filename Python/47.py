class Solution(object):
    def permuteUnique(self, nums):
        return recurse([],nums,[])
def recurse(cur,arr,lst):
    if len(arr) == 0:
        if cur not in lst:
            lst.append(cur)
        return lst
    for i in range(len(arr)):
        recurse(cur + [arr[i]],arr[:i] + arr[i+1:],lst)
    return lst