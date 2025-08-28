// import java.util.*;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

//         if (number > 0) {
//             System.out.println("Positive");
//         } 
//         else if (number == 0) {
//             System.out.println("Zero");
//         } 
//         else {
//             System.out.println("Negative");
//         }
//         sc.close();
//     }
// }

// public class Practice {

//     public static void main(String[] args) {
//         double temp = 13.5;
//         if (temp > 100) {
//             System.out.println("You have a fever");
//         }else{
//             System.out.println("You don't have a fever.");
//         }
//     }
// }

// import java.util.*;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a weak 1 to 7");
//         int weak = sc.nextInt();
//         switch (weak) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tusday");
//                 break;
//             case 3:
//                 System.out.println("wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("not in this no, in weak");
//                 break;
//         }
//     }
// }

import java.util.*;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 4 != 0) {
            System.out.println(year + " is NOT a Leap Year");
        } 
        else if (year % 100 != 0) {
            System.out.println(year + " is a Leap Year");
        } 
        else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } 
        else {
            System.out.println(year + " is NOT a Leap Year");
        }
        sc.close();
    }
}
