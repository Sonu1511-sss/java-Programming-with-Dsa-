public class SwapTwoNumber {

    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        System.out.println("Before swap x = " + x + " Before swap  y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap x = " + x + " Afterswap  in y = " + y);

    }
}