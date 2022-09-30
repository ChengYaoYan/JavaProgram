public class Main {
    public static void main(String[] args) {
        System.out.println(add(10, 20, 30, 40, 50));
    }

    static int add(int x, int y) {
        return x + y;
    }
    static int add(int x, int y, int z) {
        return x + y + z;
    }
    static int add(int x, int y, int z, int a) {
        return x + y + z + a;
    }
    static int add(int x, int y, int z, int a, int b) {
        return x + y + z + a + b;
    }
}