class Solution(object):
    def lemonadeChange(self, bills):
        lst = []
        for i in bills:
            if i == 5:
                lst.append(5)
            elif i == 10:
                try:
                    lst.remove(5)
                    lst.append(10)
                except:
                    return False
            else:
                try:
                    lst.remove(10)
                    lst.remove(5)
                    lst.append(20)
                except:
                    try:
                        for i in range(3):
                            lst.remove(5)
                        lst.append(20)
                    except:
                        return False
        return True