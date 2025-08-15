// Question1:In a program , input 3 numbers : A , B and C . You have to output the average of these 3 numbers.

// import java.util.*;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number");
//         int a = sc.nextInt();
//         System.out.println("Enter the second number");
//         int b = sc.nextInt();
//         System.out.println("Enter the third number ");
//         int c = sc.nextInt();
//         double average = (a * b * c)/3.0; 
// System.out.println("The average of the three numbers is " + average);
//     }
// }

// Question 2 : In a program , input the side of a square.You have to out put the area of the square.

// import java.util.*;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the side of the square:");
//         int side = sc.nextInt();

//         int area = side * side;
//         System.out.println("The area of the square is " + area);

//         sc.close();
//     }
// }

// Question 3 : Enter cost of 3 items from the user ( using float data type)- a pencil , a pen and an eraser. You have to output the total cost of the items back to the user as their bill.

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of a pencil:");
        float pencil = sc.nextFloat();

        System.out.println("Enter the cost of a pen:");
        float pen = sc.nextFloat();

        System.out.println("Enter the cost of an eraser:");
        float eraser = sc.nextFloat();

        // Total without tax
        float total = pencil + pen + eraser;
        System.out.println("Total bill without tax: " + total);

        // Total with 18% GST
        float newTotal = total + (total * 0.18f);
        System.out.println("Bill with 18% tax: " + newTotal);

        sc.close();
    }
}
