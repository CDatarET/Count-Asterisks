class Solution:
    def countAsterisks(self, s):
        op = False
        a = 0
        for c in s:
            if c == "|":
                if op: op = False
                else: op = True
            else:
                if op: continue
                if c == "*": a += 1
        
        return a
