import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your \n name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("Your age is " + age);

        System.out.println("where are you living in?");
        String country = scanner.nextLine();
        System.out.println("Oh " + country + " must be a beautiful place.");
    }
}