package Shorting;

public class InsertionShort {

    public static void Insertshor(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];  
            int prev = i - 1;


            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }


            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 4, 23, 2, 4 };
        Insertshor(arr);
        printArr(arr);
    }
}
