class Solution(object):
    def isOneBitCharacter(self, bits):
        n = len(bits)
        i = 0
        while i<n:
            if bits[i] == 1:
                bits = bits[i+2:]
                n = len(bits)
                i = 0
            else:
                i+=1
        return len(bits) > 0