import java.util.Scanner;

public class ListOfObjects {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        DoublyLinkedlist<Student> list=new DoublyLinkedlist<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter ID\tEnter Name\tEnter Major");
            Student s=new Student(input.nextInt(),input.next(),input.next());
            list.addLast(s);
        }
        while (! list.isEmpty()){
            System.out.println(list.removeFirst().toString());
        }
    }
}
