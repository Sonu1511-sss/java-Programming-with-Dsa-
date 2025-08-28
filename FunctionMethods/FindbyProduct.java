import java.util.*;
public class FindbyProduct {

public static void sumProduct(int a , int b){
        int produnct = a * b;
        System.out.println("product of = " + produnct);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number ");
        int a = sc.nextInt();
        System.out.print("enter the second number ");
        int b = sc.nextInt();
        sumProduct(a,b);
        sc.close();
    }
}

