val = 10
PI = 3.14159
def randint(x):
    return 3 * x + 3
class Calc:
    def __init__(self, first, second):  
         self.first = first
         self.second = second
    def add(self):
         self.result = self.first + self.second
         return self.result
    def div(self):
         self.result = self.first / self.second
         return self.result
calc1 = Calc(10, 20)