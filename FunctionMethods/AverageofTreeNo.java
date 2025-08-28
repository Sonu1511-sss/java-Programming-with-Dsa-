import java.util.Scanner;

public class AverageofTreeNo {

    public static double AvergeNumber(double a, double b, double c) {
        return  (a+b+c) / 3;
      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number =");
        double a = sc.nextDouble();
        System.out.print("enter the second number =");
        double b = sc.nextDouble();
        System.out.print("enter the third number =");
        double c = sc.nextDouble();
        System.out.print("averge of number =" + AvergeNumber(a,b,c)+ "\n");
     

        sc.close();
    }
}
