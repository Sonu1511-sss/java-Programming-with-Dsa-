import java.util.*;;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("enter a number = ");
        int num = sc.nextInt();
        int originalNum = num;
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if (originalNum == reverse) {
            System.out.println(originalNum + " palindrom number");

        } else {
            System.out.println(originalNum + " not a palindrom number");

        }
sc.close();
    }
}
