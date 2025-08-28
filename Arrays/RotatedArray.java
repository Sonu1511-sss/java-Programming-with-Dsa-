public class RotatedArray {

    public static int search(int nums[], int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;

                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    right = mid + 1;

                } else {
                    left = mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 4,  5, 6, 7, 0, 1, 2 };
        int target = 0;

        int result = search(nums, target);
        System.out.println("Index of target: " + result);
    }
}


