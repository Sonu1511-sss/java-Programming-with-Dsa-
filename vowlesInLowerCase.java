import java.util.*;

public class vowlesInLowerCase {
    public static void main(String[] args) {
        System.out.print("enter the alaphbates = ");
         String str = new Scanner(System.in).next();
        int count = 0;
        for(int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);
            if (ch =='a' || ch == 'e'|| ch == 'i' || ch == 'u' || ch == 'o' ) {
                count++;
            }
        }
        System.out.println("to volwels = " + count);
    }
}
