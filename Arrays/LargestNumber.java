public class LargestNumber {

    public static int getArray(int[] number) {
        int largest = Integer.MIN_VALUE;
               int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("smallest number is " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 7, 8, 19, 10, 11};
        System.out.println("Largest number: " + getArray(number));
    }
}
