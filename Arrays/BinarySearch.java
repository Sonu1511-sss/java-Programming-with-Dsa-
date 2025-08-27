public class BinarySearch {
    public static int BinSearch(int[] numbers, int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;  
            } else {
                end = mid - 1;   
            }
        }
        return -1;  
    }

    public static void main(String[] args) {
        int numbers[] = {1, 3, 4, 6, 8, 9, 10, 11, 12};  
        int key = 12;

        int index = BinSearch(numbers, key);

        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + index);
        }
    }
}
