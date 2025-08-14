import java.util.Scanner;

public class SumAandB {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       
      System.out.println("enter the radius " );
      Float rad = sc.nextFloat();

     Float area = 3.14f * rad * rad ; 
      System.out.println("sum of a and b is " + area);
      sc.close();

    }
}
