public class BitManupulation {

    public static int getIth(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIth(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearIthbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;

    }

    public static int updateIth(int n, int i, int newbit) {
        n = clearIthbit(n, i);

        int bitmask = newbit << i;
        return n | bitmask;

    }

    public static int clearlastbit(int n, int i) {
        int bitmask = ~(0) << i;
        return n & bitmask;

    }

    public static boolean isPowerTo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int bitmask = 1;
        int n = 5;

        System.out.println(a & b); // binary And
        System.out.println(a | b); // binary Or
        System.out.println(a ^ b); // binary Ex or
        System.out.println(~5); // binary Or 1s complement
        System.out.println(a << b); // left shift
        System.out.println(6 >> 1); // right shift
        if ((n & bitmask) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
        System.out.println(getIth(10, 3));
        System.out.println(setIth(10, 3));
        System.out.println(clearIthbit(10, 1));
        System.out.println(clearlastbit(15, 2));
        System.out.println(updateIth(10, 2, 1));
        System.out.println(isPowerTo(8));

    }
}