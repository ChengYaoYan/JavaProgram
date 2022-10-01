public class Human {
    String name = "Bili";
    int height;
    double weight;

    Human(int height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    Human(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    void who() {
    }

    public String toString() {
        return this.name;
    }
}
