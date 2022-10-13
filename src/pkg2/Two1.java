package pkg2;
import pkg1.First1;

public class Two1 {

    First1 bar = new First1();

    public void Hello() {
        System.out.println("Hello");
    }

    void Bar() {
        bar.Hello();
    }

}
