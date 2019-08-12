# data-structures-and-algorithms
# 401 Data Structures
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
## API
<!-- Description of each method publicly available to your Linked List -->
LinkedList  
add(T toAdd) -- This method takes in an object to add into the front of the linked list.  
includes(T toFind) -- This method takes in an object to look for in the linked list. returns true if found, false otherwise.  
toString() -- This method returns a string built from the linked list data.  
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
