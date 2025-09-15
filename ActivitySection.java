import java.util.ArrayList;

class ActivitySection {
    public static void main(String[] args) {
        int start[] = { 1, 2, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        // end time sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(0);
        int LastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= LastEnd) {
                maxAct++;
                ans.add(i);
                LastEnd = end[i];
            }
        }
        System.out.println("max activityies = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("a"+ ans.get(i)+ " ");
        }
        System.out.println();
    }
}