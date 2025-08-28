import java.util.Scanner;

public class BinaryToDecimal{
    public static void binToDec(int binNum) {
        int dec = 0;
        int pow = 0;
        int originalNum = binNum; 

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("Decimal of " + originalNum + " = " + dec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the baniery number = " );
        int baniery = sc.nextInt();
        binToDec(baniery);
        sc.close();
    }
}
