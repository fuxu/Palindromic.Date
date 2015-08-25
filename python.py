from datetime import date
class Palindromic:
    def __init__(self,year):
        self.year = year
        self.month = int((str(year)[2:4])[::-1])
        self.day = int((str(year)[0:2])[::-1])
    def valid(self):
        try:
            date(self.year, self.month, self.day)
            return True
        except ValueError:
            return False
    
    def __str__(self):
        return "%4d%02d%02d" % (self.year, self.month, self.day)
for i in range(1280,2999):
    tmp = Palindromic(i)
    if tmp.valid():
        print tmp
