package Shorting;

public class SelectionShort {

    public static void main(String[] args) {
        int arr[] = { 5, 2, 3, 1, 6 };
     for (int i = 1; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;

                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}