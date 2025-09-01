public class TwotComplement {
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x + " + " + 1 + " x " + -~x);
        x = -6;
        System.out.println(x + " + " + 1 + " x " + -~x);
        x = 0;
        System.out.println(x + " + " + 1 + " x " + -~x);
    }
}
