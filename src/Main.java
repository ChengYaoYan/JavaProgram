public class Main {
    public static void main(String[] args) {
        // access modifier

        // encapsulation

        // copy objects
        Car car1 = new Car("gg", "gg");
        Car car2 = new Car("tt", "tt");

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car1);
        System.out.println(car2);

        car1.copy(car2);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());

        // interface





        // polymorphism

        // dynamic polymorphism

        // exception handling
    }
}