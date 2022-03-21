import java.util.Scanner;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue<String> Queue=new ArrayQueue<>();
        Scanner input=new Scanner(System.in);
        System.out.println(" 1 insert to queue \t 2 Delete from queue ");
        int choice =-1;
        while (choice!=0){
            System.out.println(" Your choice : ");
            choice=input.nextInt();
            switch (choice){
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("input a name : ");
                    break;
                case 2:
                    System.out.println(" Romove is "+ Queue.dequeue());
                    break;
            }
            System.out.println("First = "+ Queue.first()+"\t size = "+Queue.size());
        }
    }
}
