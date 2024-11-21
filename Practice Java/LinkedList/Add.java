import java.util.LinkedList;
public class Add {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        // Add an item to a list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        
        // Add to a given index
        list.add(3, 35);
        System.out.println(list);

    }
}