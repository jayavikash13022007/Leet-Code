class Solution(object):
    def defangIPaddr(self, address):
        return "".join([x if x != "." else "[.]" for x in list(address)])