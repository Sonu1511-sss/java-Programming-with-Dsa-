import java.util.Arrays;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        // ratio[i][0] = index, ratio[i][1] = value/weight ratio
        double ratio[][] = new double[val.length][2];
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        // Sort by ratio ascending
        Arrays.sort(ratio, (a, b) -> Double.compare(a[1], b[1]));

        int capacity = w;
        double finalValue = 0;

        for (int i = ratio.length - 1; i >= 0; i--) { // Start from highest ratio
            int idx = (int) ratio[i][0];

            if (capacity >= weight[idx]) {
                // Take full item
                finalValue += val[idx];
                capacity -= weight[idx];
            } else {
                // Take fraction of item
                finalValue += val[idx] * ((double) capacity / weight[idx]);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final value = " + finalValue);
    }
}
