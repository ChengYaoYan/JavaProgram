public class Car {
    private String make = "Tesla";
    private String model = "modelY";

    Car(String make, String model) {
        this.setMake(make);
        this.setModel(model);
    }

    String getMake() {
        return this.make;
    }

    String getModel() {
        return this.model;
    }

    void setMake(String make) {
        this.make = make;
    }

    void setModel(String model) {
        this.model = model;
    }

    void copy(Car car) {
        this.setMake(car.getMake());
        this.setModel(car.getModel());
    }
}
