class Solution(object):
    def numUniqueEmails(self, emails):
        lst = []
        for i in emails:
            if "+" in i:
                lst.append("".join([x for x in i[:i.index("+")] if x!="."]) + i[i.index("@"):])
            else:
                lst.append("".join([x for x in i[:i.index("@")] if x!="."]) + i[i.index("@"):])
        return len(list(set(lst)))