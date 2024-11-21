import java.util.LinkedList;

public class AddAll {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        // Add an item to a list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<Integer>();

        // Add an item to a list
        list2.add(50); 
        list2.add(60); 
        list2.add(70); 
        list2.add(80);
        System.out.println(list2);

        list.addAll(list2); // Add items from one list into another
        System.out.println(list);
    }
}
