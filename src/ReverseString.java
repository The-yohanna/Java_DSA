import java.util.Stack;

public class ReverseString {

    public static String reverseString(String str) {
        Stack<Character> strStack = new Stack<>();
        StringBuilder reverse = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            strStack.push(str.charAt(i));
        }

        while (!strStack.isEmpty()) {
            reverse.append(strStack.pop());
        }

        return reverse.toString();
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println(reverseString(str1));
    }

}
