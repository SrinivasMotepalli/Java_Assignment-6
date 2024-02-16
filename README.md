1) Interface_STK (Interface):

void push(int element): Adds an element to the stack.
int pop(): Removes and returns the top element from the stack.
int peek(): Returns the top element without removing it from the stack.
boolean isEmpty(): Checks if the stack is empty.
boolean isFull(): Checks if the stack is full.

2) FixedStack (Class implementing Interface_STK):

int capacity: Represents the maximum capacity of the fixed-size stack.
int top: Represents the index of the top element in the stack.
int[] stack: Array to store the elements of the stack.
FixedStack(int capacity): Constructor to initialize the fixed-size stack with a given capacity.
void push(int element): Implements push for the fixed-size stack.
int pop(): Implements pop for the fixed-size stack.
int peek(): Implements peek for the fixed-size stack.
boolean isEmpty(): Checks if the fixed-size stack is empty.
boolean isFull(): Checks if the fixed-size stack is full.

3) GrowableStack (Class implementing Interface_STK):

int top: Represents the index of the top element in the stack.
int[] stack: Array to store the elements of the stack.
GrowableStack(): Constructor to initialize the growable stack with an initial capacity of 10.
void push(int element): Implements push for the growable stack with array resizing if needed.
int pop(): Implements pop for the growable stack with array resizing if needed.
int peek(): Implements peek for the growable stack.
boolean isEmpty(): Implements isEmpty for the growable stack.
boolean isFull(): Implements isFull for the growable stack.

4) main (Method):

Creates instances of FixedStack and GrowableStack.
Tests the methods by pushing, popping, and peeking elements in both types of stacks.
