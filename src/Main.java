import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<String>();

        foods.add("pizza");
        foods.set(0, "banana");

        foods.forEach(System.out::println);
    }
}