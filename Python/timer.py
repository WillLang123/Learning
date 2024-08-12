class Timer:
    list = [0,0,0]
    
    def __init__(self,hr,min,sec):
        self.list = [hr,min,sec]
        # Write code here
        #

    def __str__(self):
        word = ""
        word+=str(self.list[0])
        word+=":"
        word+=str(self.list[1])
        word+=":"
        word+=str(self.list[2])
        return word
        #
        # Write code here
        #

    def next_second(self):
        self.list[2]+=1
        if(self.list[2]>=60):
            self.list[1]+=1
            self.list[2]-=60
            if(self.list[1]>=60):
                self.list[0]+=1
                self.list[1]-=60
                if(self.list[0]>=24):
                    self.list[0]-=24
        #
        # Write code here
        #

    def prev_second(self):
        self.list[2]-=1
        if(self.list[2]<0):
            self.list[1]-=1
            self.list[2]+=60
            if(self.list[1]<0):
                self.list[0]-=1
                self.list[1]+=60
                if(self.list[0]<0):
                    self.list[0]+=24
        #
        # Write code here
        #


timer = Timer(23, 59, 59)
print(timer)
timer.next_second()
print(timer)
timer.prev_second()
print(timer)
