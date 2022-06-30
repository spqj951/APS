import java.util.Stack;

public class Stack_API {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(2);
        stack.push(3);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
