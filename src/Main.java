import java.lang.reflect.Type;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] nums = {"1", "2", "3"};

        Arrays.sort(nums);

        for (String num : nums) {
            System.out.println(num);
        }
    }
}