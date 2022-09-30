// import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String name = JOptionPane.showInputDialog("Enter your name");
//        JOptionPane.showMessageDialog(null, "Hello" + name);
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        JOptionPane.showMessageDialog(null, "you are " + age + " years old");
//
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//        JOptionPane.showMessageDialog(null, "you are " + height + "cm height");

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter the side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt(x*x + y*y);
        System.out.println("The side z is:  " + z);
    }
}