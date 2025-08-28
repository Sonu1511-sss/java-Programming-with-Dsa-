public class SubArray {

    public static void MaxSubArrays(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }


        for (int start = 0; start < numbers.length; start++) {
            for (int end = start; end < numbers.length; end++) {
                int curSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < curSum) {
                    maxSum = curSum;
                }
            }
        }

        System.out.println("Total max subarray sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        MaxSubArrays(numbers);
    }
}
