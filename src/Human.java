public class Human {
    String name = "Bili";
    int height;
    double weight;
    static int people = 0;

    Human(int height, double weight) {
        this.height = height;
        this.weight = weight;
        people++;
    }
    Human(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        people++;
    }

    void who() {
    }

    public String toString() {
        return this.name;
    }

    static int getPeople() {
        return people;
    }
}
