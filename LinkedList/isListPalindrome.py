# Singly-linked lists are already defined with this interface:
# class ListNode(object):
#   def __init__(self, x):
#     self.value = x
#     self.next = None
#
def isListPalindrome(l):
    slow = l
    stack = []
    ispalin = True
    while(slow!=None):
        stack.append(slow.value)
        slow = slow.next
    while(l!=None):
        i =stack.pop()
        if(l.value==i):
            ispalin = True
        else:
            ispalin = False
            break
        l = l.next
    return ispalin
