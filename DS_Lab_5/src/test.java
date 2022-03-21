import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        DoublyLinkedlist<String> list=new DoublyLinkedlist<>();
        for (int i = 0; i < 6; i++) {
            int choice=-1;

            System.out.print(" Select the appropriate Number of the Operation: \n"+
                                   " 1- To insert new element First. \n"+
                                    " 2- To insert new element First. \n"+
                                     " 3- To Delete element from First.\n"+
                                     " 4- To Delete element from Last.\n"+
                                     " Your Selection is: ");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.print(" Input Name: ");
                    list.addFirst(input.next());
                    break;
                case 2:
                    System.out.print(" Input Name: ");
                    list.addLast(input.next());
                    break;
                case 3:
                    System.out.print(" Deleted Name is ");
                    list.removeFirst();
                    break;
                case 4:
                    System.out.print(" Deleted Name is ");
                    list.removeLast();
                    break;

            }
            System.out.println(" First element: "+list.first()+ ",  Last element: "+list.last()+",  Size : "+list.size());
            System.out.println(" ");
        }
    }
}
