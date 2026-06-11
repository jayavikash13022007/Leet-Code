class Solution(object):
    def assignEdgeWeights(self, edges):
        d = {}
        for i in edges:
            i.sort()
            try:
                d[i[0]] += [i[1]]
            except:
                d[i[0]] = [i[1]]
        max_ = 0
        max_ = recurse(1,d,0,max_)
        return (2 ** (max_-1))%(10 ** 9 + 7)
def recurse(num,d,count,max_):
    try:
        for i in d[num]:
            max_ = recurse(i,d,count + 1,max_)
    except:
        return max(max_,count)
    return max_