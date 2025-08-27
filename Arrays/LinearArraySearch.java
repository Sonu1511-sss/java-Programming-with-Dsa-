public class LinearArraySearch {


    public static int LinearArray(int[] number, int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int number[] = {2, 3, 7, 6, 9, 12, 16, 20};
        int key = 18;

        int index = LinearArray(number, key);

        if (index == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("Key is found at index: " + index);
        }
    }
}
