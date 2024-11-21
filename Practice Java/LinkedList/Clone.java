import java.util.LinkedList;

public class Clone {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        // Add an item to a list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        @SuppressWarnings("unchecked")
        LinkedList<Integer> list2 = (LinkedList<Integer>) list.clone();
        list2.add(0, 5);
        System.out.println(list2);
    }
}
