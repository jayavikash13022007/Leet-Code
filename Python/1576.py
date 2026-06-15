class Solution(object):
    def modifyString(self, s):
        s = list(s)
        for i in range(len(s)):
            if s[i] == "?":
                try:
                    val = 97
                    while True:
                        s[i] = chr(val)
                        val += 1
                        if s[i-1] != s[i] and s[i+1] != s[i]:
                            break
                except:
                    if len(s) > 1:
                        if i == 0:
                            s[i] = chr((ord(s[i+1])+1 - 97)%26 + 97)
                        else:
                            s[i] = chr((ord(s[i-1])+1 - 97)%26 + 97)
                    else:
                        s[i] = "a"
        return "".join(s)