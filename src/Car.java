public class Car implements tool1, tool2 {
    private String make = "Tesla";
    private String model = "modelY";

    Car(String make, String model) {
        this.setMake(make);
        this.setModel(model);
    }


    @Override
    public void to1() {

    }

    @Override
    public void to2() {

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
