public class Main {
    public interface Interface_STK {
        void push(int element);
        int pop();
        int peek();
        boolean isEmpty();
        boolean isFull();
    }

    public static class FixedStack implements Interface_STK {
        private int capacity;
        private int top;
        private int[] stack;

        public FixedStack(int capacity) {
            this.capacity = capacity;
            this.top = -1;
            this.stack = new int[capacity];
        }

        @Override
        public void push(int element) {
            if (!isFull()) {
                stack[++top] = element;
                System.out.println("Pushed element: " + element);
            } else {
                System.out.println("Stack is full. Cannot push element: " + element);
            }
        }

        @Override
        public int pop() {
            if (!isEmpty()) {
                int poppedElement = stack[top--];
                System.out.println("Popped element: " + poppedElement);
                return poppedElement;
            } else {
                System.out.println("Stack is empty. Cannot pop.");
                return -1; // or throw an exception
            }
        }

        @Override
        public int peek() {
            if (!isEmpty()) {
                return stack[top];
            } else {
                System.out.println("Stack is empty. Cannot peek.");
                return -1; // or throw an exception
            }
        }

        @Override
        public boolean isEmpty() {
            return top == -1;
        }

        @Override
        public boolean isFull() {
            return top == capacity - 1;
        }
    }

    public static class GrowableStack implements Interface_STK {
        private int top;
        private int[] stack;

        public GrowableStack() {
            this.top = -1;
            this.stack = new int[10]; // Initial capacity, can be adjusted as needed
        }

        @Override
        public void push(int element) {
            // Implement push logic with array resizing if needed
        }

        @Override
        public int pop() {
            // Implement pop logic with array resizing if needed
            return 0;
        }

        @Override
        public int peek() {
            // Implement peek logic
            return 0;
        }

        @Override
        public boolean isEmpty() {
            // Implement isEmpty logic
            return false;
        }

        @Override
        public boolean isFull() {
            // Implement isFull logic
            return false;
        }
    }

    public static void main(String[] args) {
        // Test fixed stack
        Interface_STK fixedStack = new FixedStack(5);
        fixedStack.push(1);
        fixedStack.push(2);
        fixedStack.pop();

        // Test growable stack
        Interface_STK growableStack = new GrowableStack();
        growableStack.push(1);
        growableStack.push(2);
        growableStack.pop();
    }
}
