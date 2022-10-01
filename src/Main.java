public class Main {
    public static void main(String[] args) {

        Human person1 = new Human(170, 120.5);
        Human person2 = new Human("Jack", 170, 120.5);

        person1.who();
        person2.who();
    }
}