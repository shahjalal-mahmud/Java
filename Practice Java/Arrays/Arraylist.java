import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add(0, "TATA NANO");
        cars.set(2, "BMW series10");
        System.out.println(cars);
        System.out.println(cars.get(3));
        cars.remove(4);
        System.out.println(cars);
        System.out.println(cars.size());
        cars.clear();
        System.out.println(cars.size());

    }
}
