import java.util.Stack;

public class Question_2 {
    public static Stack<Integer> RecursionPop(Stack stack) {

        if(stack.isEmpty()) {
            return null;
        }
        stack.pop();
        RecursionPop(stack);
        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<Integer>();
        for (int i = 0; i <5 ; i++) {
            stack.push(i);
        }
        System.out.println("Stack before popping:"+stack);
        System.out.println("Stack elements have been popped:"+RecursionPop(stack));

    }
}
