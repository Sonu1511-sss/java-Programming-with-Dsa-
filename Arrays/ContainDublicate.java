public class ContainDublicate {

    public static boolean ContDublicate(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3,2,4,8};
        System.out.println(ContDublicate(nums));
       
    }
}