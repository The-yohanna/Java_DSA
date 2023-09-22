package stack;

public class StackSort {

    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> additionStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!additionStack.isEmpty() && additionStack.peek() > temp) {
                stack.push(additionStack.pop());
            }
            additionStack.push(temp);
        }

        while (!additionStack.isEmpty()) {
            stack.push(additionStack.pop());
        }
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(4);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();
    }
}
