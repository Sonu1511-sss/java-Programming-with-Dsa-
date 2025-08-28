// import java.util.*;

// public class forloop {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= 4; j++) {
//                 System.out.print("*");
//             }
// System.out.println();
//         }
//     }
// }



public class forloop {
    public static void main(String[] args) {
      int n = 45676879;

        while (n > 0) {
            int lastDigit = n % 10;   
            System.out.print(lastDigit + " ");  
            n = n / 10;  
        }
        System.out.println();
        
    }
}

