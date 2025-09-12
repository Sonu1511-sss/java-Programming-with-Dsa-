import java.util.Stack;

public class ReversetoString {
    public static String ReverseString(String str) {
        Stack<Character> s = new Stack<>();
        
        // Push all characters into the stack
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        // Pop from stack and build reversed string
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        String result = ReverseString(str);
        System.out.println("Reversed: " + result);
    }
}
