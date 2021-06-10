class Node:
    def __init__(self,dataval):
        self.dataval = dataval
        self.nextval = None
class LinkedList:
    def __init__(self):
        self.headval = None
    def printlist(self):
        while(self.headval is not None):
            print(self.headval.dataval)
            self.headval = self.headval.nextval
    def insertAtBegining(self,ele):
        Newnode = Node(ele)
        Newnode.nextval =self.headval
        self.headval = Newnode
    def insertAtEnd(self,ele):
        Newnode = Node(ele)
        if self.headval is None:
            self.headval = Newnode
            return
        last = self.headval
        while(last.nextval is not None):
            last = last.nextval
        last.nextval = Newnode
        return
    def insertAtMiddle(self,middle,ele):
        Newnode = Node(ele)
        Newnode.nextval = middle.nextval
        middle.nextval = Newnode
    def remove(self,ele):
        h = self.headval
        if(h.dataval==ele):
            self.headval = h.nextval
            h = None
            return
        while(h is not None):
            if(h.dataval == ele):
               break
            prev = h
            h = h.nextval
        if(h == None):
            return
        prev.nextval = h.nextval
        h = None
            
s = LinkedList()
s.headval = Node(1)
e2 = Node(2)
e3 = Node(3)
s.headval.nextval = e2
e2.nextval = e3
s.insertAtBegining(0)
s.insertAtEnd(4)
s.insertAtMiddle(e2,2.5)
s.remove(2.5)
s.printlist()
