import java.util.Arrays;
import java.util.Comparator;

public class MaximumeChai {
    public static void main(String[] args) {
        int pairs[][] = {{5,24},{36,60},{67,40},{50,90},{50,28}};

        // Sort pairs by their second element (end time)
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));

        int chainLen = 1; 
        int pairEnd = pairs[0][1]; // first pair’s end

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > pairEnd) { // if current pair start > last pair end
                chainLen++;
                pairEnd = pairs[i][1]; // update end to current pair’s end
            }
        }

        System.out.println("Maximum length of chain = " + chainLen);
    }
}
