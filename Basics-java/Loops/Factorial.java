import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        int num;
        int fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        num = sc.nextInt();   

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
        sc.close();
    }
}


