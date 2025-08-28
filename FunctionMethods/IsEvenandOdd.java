import java.util.Scanner;

public class IsEvenandOdd {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number =");
        int num = sc.nextInt();
        if (isEven(num)) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

        sc.close();
    }
}
