import java.util.*;

public class SwapToNo {
    public static void Swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(11);
        list.add(16);
        System.out.println(list);
        int index1 = 1, index2 = 3;
        Swap(list, index1, index2);
        System.out.println(list);
    }
}
