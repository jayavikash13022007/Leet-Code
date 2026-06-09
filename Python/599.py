class Solution(object):
    def findRestaurant(self, list1, list2):
        least = 10000
        a = 0
        lst = []
        for i in range(len(list1)):
            for j in range(len(list2)):
                if list1[i] == list2[j]:
                    if i+j < least:
                        least = i+j
        for i in range(len(list1)):
            for j in range(len(list2)):
                if list1[i] == list2[j]:
                    if i+j == least:
                        lst.append(list1[i])
        return lst