import java.util.*;
public class SumEvenOdd {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sumEven = 0;
    int sumOdd = 0;

    System.out.println("enter " + n + " integer");
    for(int i = 0; i< n ; i++){
        int num = sc.nextInt();
        if (num % 2 ==0) {
            sumEven+=num;
        }else{
            sumOdd+=num;
        }
    }
    System.out.println("sum of even number" + sumEven);
    System.out.println("sum od odd number "+ sumOdd);
}
    
}