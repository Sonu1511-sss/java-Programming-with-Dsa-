package Bactraking;
public class FindSubSet {

    public static void findSubSet(String str, String ans, int i) {
        // base case
        if (i == str.length()) {

            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        findSubSet(str, ans + str.charAt(i), i + 1);
        findSubSet(str, ans, i + 1);
    }

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubSet(str, "", 0);
    }
}
