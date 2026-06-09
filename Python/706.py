class MyHashMap(object):

    def __init__(self):
        self.d = {}
    def put(self, key, value):
        self.d[key] = value
    def get(self, key):
        return self.d[key] if key in self.d else -1
    def remove(self, key):
        if key in self.d:
            self.d.pop(key)