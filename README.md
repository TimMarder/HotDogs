# HotDogs
Team HotDogs -- Tim Marder, Maxwell Vale, Max Millar

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
