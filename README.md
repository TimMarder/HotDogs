# HotDogs
Team HotDogs -- Tim Marder, Maxwell Vale, Max Millar

## ArrayPriorityQueue Methods

### void add (String val)
**_Runtime: O(1)_**

_Our Decision:_ We chose to use the built-in ArrayList add() for this method since it requires the least amount of work and has the fastest possible runtime (constant).

### boolean isEmpty()
**_Runtime: O(1)_**

_Our Decision:_ We chose to use the built-in ArrayList size() for this method to check if the length of the queue is equal to zero. It was a minimal amount of work and has the fastest possible runtime (constant).

### String peekMin()
**_Runtime: O(n)_**

_Our Decision:_ We created a variable that is the first element of the queue. We then used a foreach loop to traverse the elements and compare the current element to zero. If the element is larger than zero, then the variable was set to the element. According to the duke API for ArrayPriorityQueue, the average runtime for peekMin() is linear, which is what we achieved here. The variable with the final value is returned in the end.

### String removeMin()
**_Runtime: O(n)_**

_Our Decision:_ We used the previous method _peekMin()_ to find the index of the smallest value in the queue. We then used the built-in ArrayList remove() method to remove that value from the queue. It was a minimal amount of work and achieved the average runtime (linear) as stated on the Duke API for ArrayPriorityQueue.



## ALHeap

### Prioritized Method List

1. isEmpty()
1. add(Integer addVal)
1. toString() --> The simple version
1. peekMin()
1. minChildPos(int pos)
1. removeMin()

### Method Algorithms

#### isEmpty()
Since the underlying ArrayList contained already has an isEmpty() method, we can simply use that method.

#### add(Integer addVal)
1. Add addVal to the end of the ArrayList (last element in bottom level of tree, left justified)
1. Compare the value of addVal to its current parent
  1. If addVal > parentVal, then addVal is in a valid position and min heap-ness is maintained
  1. If addVal < parentVal, swap addVal and parentVal.
1. Repeat the swapping until addVal is greater than its parent or it reaches the root, in which case addVal would be in a valid position in the min Heap (Heap-ness maintained!)

#### toString() --> Simple Version
Since the simple version is just to print the level-order traversal, you can simply print each element in the ArrayList with a space in between.

#### peekMin()
Since the Heap is a min Heap, the smaller value is always the parent of larger values. So, the smallest value of the min Heap would have to be at the root of the tree, which is first in a level-order traversal. That means that the smallest value should always be the first element in the ArrayList, so _heap.get(0)_ should give the smallest value.

#### minChildPos(int pos)
1. If pos is out of bounds of the ArrayList size or if there are no children from pos (by checking if supposed children's indices are out of bounds of the ArrayList size), return -1
1. If there is only one child (the left child), you can return the index of that child (2 * pos + 1)
1. If there are two children, return the index of the smaller child

#### removeMin()
1. Swap the root of the tree with the rightmost element on the bottom level
1. Remove the last element in the ArrayList (should be where the smallest element was moved to)
1. Now, to maintain min Heap-ness, need to move the root value down the tree if necessary
1. If any of the root's children are smaller than the root itself, swap the root and the smaller child
1. Continue to swap until the value is smaller than both children
