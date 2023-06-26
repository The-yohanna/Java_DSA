import java.util.Objects;

public class test {
    public static void compare(Integer a, Integer b) {
        if (Objects.equals(a, b)) {
            System.out.println("a and b are equal");
        }
        else {
            System.out.println("a and b are not equal");
        }
    }
    public static void main(String[] args) {
        int a = 1000;
        int b = 1000;
        compare(a,b);
    }
}
