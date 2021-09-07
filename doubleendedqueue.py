class doubleEndedQueue:
    def __init__(self):
        self.limit = 6
        self.front = None
        self.rear = None
        self.db_queue = []
    def enq_front(self,ele):
        if(self.front == 0):
            print("Cannot insert at front")
        else:
            if(self.front == None and self.rear == None):
                self.front = 0
                self.rear=0
            else:
                self.front-=1
        self.db_queue.insert(0,ele)
    def deq_front(self):
        if(self.front == None):
            print("Queue underflow")
        else:
            print(self.db_queue.pop(0))
            if(self.front ==0 and self.rear ==0):
                self.front=self.rear=None
            else:
                self.front+=1
                
    def enq_rear(self,ele):
        if(self.rear == self.limit-1):
            print("Cannot insert at rear")
        elif(self.rear == None and self.front==None):
            self.rear=0
            self.front = 0
        else:
            self.rear+=1
        self.db_queue.append(ele)
    def deq_rear(self):
        if(self.rear == None):
            print("Cannot delete element")
        else:
            if(self.front==self.rear):
                self.front = None
                self.rear= None
            else:
                print(self.db_queue.pop())
                self.rear-=1
    def display(self):
        if(len(self.db_queue)==0):
            print("Queue empty")
        for i in self.db_queue:
            print(i,end=" ")
            
db = doubleEndedQueue()
db.enq_rear(6)
db.display()
db.enq_front(7)
db.display()
db.enq_front(8)
db.display()
db.deq_front()
db.display()
db.deq_rear()
db.display()
            
        
            
