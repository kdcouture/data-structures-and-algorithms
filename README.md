# data-structures-and-algorithms
# 401 Data Structures
# [Stacks and Queues](https://github.com/kdcouture/data-structures-and-algorithms/tree/master/Data-Structures/Stacks_And_Queues/src/main/java/stacks_and_queues)
## Challenge
Create an implementation of a Stack and a Queue using a linked list like structure.
## Approach & Efficiency
Method    Time    Space
### AnimalShelter
Enqueue(Animal data)    O(1)    O(1)
Dequeue()    O(1)    O(1)
Dequeue(String Pref)    O(n)    O(1)

### PusedoQueue
Enqueue(T data)    O(1)    O(1)  
Dequeue()    O(n)    (1)  
Peek()    O(n)    (1)  

---
### Stack
Peek()    O(1)    O(1)  
Push(T data)    O(1)    O(1)  
Pop()     O(1)    O(1)  

---
### Queue
Peek()    O(1)    O(1)  
Enqueue(T data) O(1)    O(1)  
Dequeue() O(1)    O(1)  

---
## API
### AnimalShelter
Enqueue(Animal data) - Places an animal at the fornt of the queue.  
Dequeue() - Removes the longest existing aninal from the shelter.  
Dequeue(String Pref) - Removes the longest existing aninal of the prefered type.  
### PusedoQueue
Enqueue(T data) - Places an element into the pusedoqueue.
Dequeue() - Removes an element from the psuedoqueue.
Peek() - looks at the top element of the psuedoqueue.
### Stack
Stack() - Creates an empty stack.  
Peek() - Looks at the top element.  
Push(T data) - Inserts an element on the top of the stack.  
Pop() - Removes the element on top of the stack.
### Queue
Queue() - Creates an empty queue.  
Peek() - Looks at the top element.  
Enqueue(T data) - Inserts an element in the back of the queue.  
Dequeue() - Removes the element in the front of queue.  

---
### Animal, Dog, Cat

These classes are holders for the name and type of animal in the shelter.

---
### Node

Node(T data, Node next) - Constructs a node and sets its instance vars.

---
### Whiteboards
![wbimg](https://github.com/kdcouture/data-structures-and-algorithms/blob/master/code401challenges/assets/psuedoQueueWBimg.jpg)

---

# [Linked List](https://github.com/kdcouture/data-structures-and-algorithms/tree/linked_list/Data-Structures/LinkedList/src/main/java/LinkedList)
<!-- Short summary or background information -->
## Challenge
<!-- Description of the challenge -->
Create an implementation of the Linked List data structure.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
 Method             Time                  Space  
 Constructor        O(1)                  O(1)  
 add                O(1)                  O(1)  
 includes           O(n)                  O(1)  
 append             O(n)                  O(1)  
 insertBefore       O(n)                  O(1)  
 insertAfter        O(n)                  O(1)  
 kthFromEnd         O(n)                  O(1)  
 merge              O(m+n)                O(1)
## API
<!-- Description of each method publicly available to your Linked List -->
LinkedList  
add(T toAdd) -- This method takes in an object to add into the front of the linked list.  
includes(T toFind) -- This method takes in an object to look for in the linked list. returns true if found, false otherwise.  
toString() -- This method returns a string built from the linked list data.  
append(T toAppend) -- This method appends the given value to the end of the linked list.  
insertBefore(T toFind, T toAdd) -- This method will search for a given value toFind and will place the new value toAdd infront of the element found. Throws execption if not found.  
insertAfter(T toFind, T toAdd) -- This method will search for given value toFind and will place a new node with value toAdd after it. Throws execption if not found.  
kthFromEnd(int k) -- This method will find the kth element from the end. (last element is considered 0th from the end)  
merge(LinkList l1, LinkedList l2) -- This function merges two linked lists in a zipper fashion.
### Whiteboarding
Code Challenge 8
![Whiteboard image](https://github.com/kdcouture/data-structures-and-algorithms/blob/master/code401challenges/assets/401cc8.jpg)
Code Challenge 7  
![Whiteboard image](https://github.com/kdcouture/data-structures-and-algorithms/blob/master/code401challenges/assets/cc7.jpg)
Code Challenge 6
![Whiteboard image](https://github.com/kdcouture/data-structures-and-algorithms/blob/master/code401challenges/assets/cc6WhiteBoard.jpg)
# 401 Code Challenges
<!-- -->
# [Binary Search](https://github.com/kdcouture/data-structures-and-algorithms/tree/master/code401challenges/BinarySearch)
<!-- Short summary or background information -->
Apply the Binary Search algorithim to an ingeter array.
### Challenge
<!-- Description of the challenge -->
Binary search in a sorted 1D array.
### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Using the provided [resources](https://en.wikipedia.org/wiki/Binary_search_algorithm), we were able to able to re create the binary search algorithim. Time: O(log n) Space: O(1)
### Solution
<!-- Embedded whiteboard image -->
![Whiteboard image](https://github.com/kdcouture/data-structures-and-algorithms/blob/master/code401challenges/assets/401cc3.jpg)
<!-- -->
# [Insert and Shift an Array](https://github.com/kdcouture/data-structures-and-algorithms/tree/master/code401challenges/ArrayReverse)
<!-- Short summary or background information -->
Insert an integer into an array at the middle then shift all other elements down one.
### Challenge
<!-- Description of the challenge -->
Write a function called insertShiftArray which takes in an array and the value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.
### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Find the mid point of our input array. Copy the first half of the original array into a newly create array with a size 1 larger than than the input array. at the mid point place the target value into it. Copy the remaining elemends from the original into the new array. Return the new array. Time: O(n) Space: O(n)
### Solution
<!-- Embedded whiteboard image -->
![Whiteboard image](https://github.com/kdcouture/data-structures-and-algorithms/blob/master/code401challenges/assets/401cc1.jpg)
<!-- -->
# [Reverse an Array](https://github.com/kdcouture/data-structures-and-algorithms/tree/master/code401challenges/ArrayReverse)
<!-- Short summary or background information -->
Use java to reverse an integer array.
### Challenge
<!-- Description of the challenge -->
Reverse an array.
### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Iterate to the midpoint and for each element at index (i), swap it for the element at (length-1-i).
### Solution
<!-- Embedded whiteboard image -->
![Whiteboard image](https://github.com/kdcouture/data-structures-and-algorithms/blob/master/code401challenges/assets/401cc1.jpg)
