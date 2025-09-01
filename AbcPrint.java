public class AbcPrint {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' ')); // Converts to lowercase using bitwise OR
        }
    }
}
