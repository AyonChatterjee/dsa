class Node:

    # Function to initialize the node object
    def __init__(self , data):
        self.data = data # Assign data
        self.next = None # Initialize next as null


# Linked List class contains a Node object
class LinkedList:

    # Function to initialize head
    def __init__(self):
        self.head = None


if __name__ =='__main__':
    list = LinkedList()

    list.head = Node(1)
    second = Node(2)
    third = Node(3)

    list.head.next = second
    second.next = third