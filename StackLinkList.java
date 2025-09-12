public class StackLinkList {

    // Node class (represents each element in the stack)
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class (manages stack operations)
    static class Stack {
        private Node head = null;  // top of stack

        // check if stack is empty
        public boolean isEmpty() {
            return head == null;
        }

        // push element on top
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // pop element from top
        public int pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack Underflow (empty stack)");
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek at the top element
        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return head.data;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Top element: " + s.peek()); // should print 3

        System.out.println("Stack elements (LIFO order):");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
