import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double x  = Double.parseDouble(JOptionPane.showInputDialog("Enter the side x"));
        double y  = Double.parseDouble(JOptionPane.showInputDialog("Enter the side y"));
        double z = Math.sqrt(x*x + y*y);

        JOptionPane.showMessageDialog(null, "hypotenuse is " + z);
    }
}