public class MergeSort {

    // Function to merge two sorted arrays
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // Create temp array
        int i = si;     // Index for start
        int j = mid + 1; // Index for middle
        int k = 0;      // Index for temp

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i]; // Add element to temp if smaller
                i++; // Increment i
            } else {
                temp[k] = arr[j]; // Add element to temp if smaller
                j++; // Increment j
            }
            k++; // Increment temp index
        }

        // Add remaining elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Add remaining elements
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Main mergeSort function
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return; // Base case
        }

        int mid = si + (ei - si) / 2; // Find middle

        mergeSort(arr, si, mid); // Sort first half
        mergeSort(arr, mid + 1, ei); // Sort second half

        merge(arr, si, mid, ei); // Merge the arrays
    }

    // Utility function to print the array
    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " "); // Print each number
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        System.out.println("Original Array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1); // Sort the array

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
