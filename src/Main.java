import java.io.File;

public class Main {
    public static void main(String[] args) {
        File tt = new File("./secret.txt");

        if (tt.exists()) {
            System.out.println(tt.getPath());
            System.out.println(tt.delete());
        } else  {
            System.out.println("doesn't exist");
        }
    }
}