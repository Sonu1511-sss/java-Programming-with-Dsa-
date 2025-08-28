// import java.util.*;

// public class largestNo {

//      public static void main (String args[]){
//         int a = 12;
//         int b = 18;
//         if(a>=b){
//             System.out.println("A is largest No.");
//         }else{
//             System.out.println("B is largest No.");
//         }
//      }
// }

import java.util.*;

public class largestNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
     if(a >= b && a >=c){
        System.out.println("A is largest no . ");
     }else if(b >= c){
        System.out.println("B is largest No. ");
     }else{
        System.out.println("C is largest no .");
     }
        
sc.close();
    }
}