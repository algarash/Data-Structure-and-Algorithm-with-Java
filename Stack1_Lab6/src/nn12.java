public class nn12 {
    public static void main (String []args)
    {
        Stack<Integer>  stack =new ArrayStack<> (10);

        for (int i= 1; i<= 10; i++)
            if (i % 3 != 0)
            {	stack.push(i* 2);	} else
            {
                stack.pop();	}
    }

}
