import java.util.Scanner;

public class testStack {
    public static void main(String[] args) {
        Linked_list_Stack<String> stack=new Linked_list_Stack<>();
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.print("Input Name: ");
            stack.push(input.next());
            System.out.println(" Top : "+stack.top()+"\t size : "+stack.size());
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop()+"\t");
        }
    }
}
