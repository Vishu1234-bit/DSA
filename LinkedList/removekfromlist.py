# Singly-linked lists are already defined with this interface:
# class ListNode(object):
#   def __init__(self, x):
#     self.value = x
#     self.next = None
#
def removeKFromList(l, k):
    curr = l
    while curr is not None:
        if (curr.value!=k):
            break
        curr=curr.next
    head = curr
    prev = None
    while curr is not None:
        if (curr.value==k):
            if prev is not None:
                prev.next = curr.next
            curr = curr.next
            continue
        prev = curr
        curr=curr.next
    return head
            

