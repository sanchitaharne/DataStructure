import java.util.ArrayDeque;
import java.util.Deque;

public class StackEx {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("first");
        stack.push("second");
        stack.push("third");

        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        stack.poll();
        stack.pop();
        stack.poll();
        //stack.pop();
        System.out.println(stack);
    }
}
