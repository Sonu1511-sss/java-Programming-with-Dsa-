import java.util.*;
public class SumCalculate {

    public static void SumCalculate(int a , int b){
        int sum = a + b;
        System.out.println("sum of = " + sum);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        SumCalculate(a,b);
        sc.close();
    }
    
}