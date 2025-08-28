import java.util.*;
public class MultiplicationTable  {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number : ");
    int n = sc.nextInt();
    System.out.println("multiplcation of a table : " + n);
    for(int i = 1 ; i<=10;i++){
        System.out.println(n + " * " + i + " = " + (n*i));
    }
   } 
}

