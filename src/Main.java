import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final ArrayList<String> foods = new ArrayList<String>();

        foods.add("Banana");
        foods.add("Banana");
        foods.forEach(System.out::println);

        foods = new ArrayList<String>();

    }
}