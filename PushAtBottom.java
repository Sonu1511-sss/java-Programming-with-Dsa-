import java.util.Stack;

public class PushAtBottom {

    // recursive function to insert element at bottom
    public static void pushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();       // remove top
        pushBottom(s, data);     // recursive call
        s.push(top);             // push top back
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(4);
        s.push(6);
        s.push(8);

        System.out.println("Original stack: " + s);

        pushBottom(s, 10); // insert 10 at bottom

        System.out.println("Stack after inserting at bottom: " + s);
    }
}
