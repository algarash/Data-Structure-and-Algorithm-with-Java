import java.util.Stack;

public class Quetion_3 {
    static int postFixEvalu(String expression)
    {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<expression.length();i++) {
            char x=expression.charAt(i);
            if(Character.isDigit(x))
                stack.push(x - '0');
            else
            {
                int value1 = stack.pop();
                int value2 = stack.pop();

                switch(x)
                {
                    case '+':
                        stack.push(value2+value1);
                        break;

                    case '-':
                        stack.push(value2- value1);
                        break;

                    case '/':
                        stack.push(value2/value1);
                        break;

                    case '*':
                        stack.push(value2*value1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        String exp="426*+2-";
        System.out.println("Expression in normal Case is ((2*6)+4)-2");
        System.out.println("Postfix expression to evaluate is: "+exp);
        System.out.println("postfix evaluation: "+postFixEvalu(exp));
    }
}
