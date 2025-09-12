import java.util.Stack;

public class StockSpan {

    public static void stockspan(int[] stocks, int[] span) {
        Stack<Integer> s = new Stack<>(); // stack will store indexes

        span[0] = 1;  // first day span is always 1
        s.push(0);    // push index of first day

        for (int i = 1; i < stocks.length; i++) {
            // Pop smaller prices
            while (!s.isEmpty() && stocks[i] >= stocks[s.peek()]) {
                s.pop();
            }

            // If stack is empty, span = i+1
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }

            // push this day's index
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 85, 100};
        int span[] = new int[stocks.length];

        stockspan(stocks, span);

        System.out.println("Stock spans:");
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
