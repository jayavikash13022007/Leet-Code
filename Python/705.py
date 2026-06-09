class MyHashSet(object):
    def __init__(self):
        self.set = []
    def add(self, key):
        self.set.append(key)
    def remove(self, key):
        self.set = [x for x in self.set if x!= key]
    def contains(self, key):
        return True if key in self.set else False