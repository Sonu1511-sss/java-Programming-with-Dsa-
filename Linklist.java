import java.util.*;

public class Linklist {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(3);
        ll.add(4);
        ll.add(7);
        ll.add(8);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}