// public class whileloop {

// public static void main(String[] args) {
//     int counter = 2;
//     while(counter <= 100){
//         System.out.println(counter);
//         counter = counter*2;
//     }
// }    
// }



// import java.util.*;

// public class whileloop {

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("enter the number");
//     int n = sc.nextInt();
//    int counter = 1;
//     while(counter <= n){
//         System.out.println(counter + " ");
//         counter++;
//     }
//     sc.close();
// }    
// }


import java.util.*;

public class whileloop {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number  ");
    int n = sc.nextInt();
    int i = 1;
    int sum = 0;
    while(i <= n){
        sum =sum +i;
        i++;
    }
    System.out.println(sum);
    sc.close();
}    
}