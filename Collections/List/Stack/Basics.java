
import java.util.Stack;

class Basics{
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        for (int i = 2; i < 10; i+=2) {
            stack.push(i);
        }
        System.out.println("Stack: "+stack);

        System.out.println("First removal: "+stack.pop());

        System.out.println("Stack: "+stack);

        System.out.println("Peek element: "+stack.peek());

        System.out.println("Is stack empty: "+stack.isEmpty());
    }
}