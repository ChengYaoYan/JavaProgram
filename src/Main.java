public class Main {
    public static void main(String[] args) {

        Human person1 = new Human(170, 120.5);
        Human person2 = new Human("Jack", 170, 120.5);

        System.out.println(Human.getPeople());
        Human person3 = new Human("Jack", 170, 120.5);
        System.out.println(Human.getPeople());
    }

}