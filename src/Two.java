public class Two extends First{
    String name;

    Two(int num, String name) {
        super(num);
        this.name = name;
    }

    @Override
    int getNum() {
        return super.getNum() + 1;
    }
}
