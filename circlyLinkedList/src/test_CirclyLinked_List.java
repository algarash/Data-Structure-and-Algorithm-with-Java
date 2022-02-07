import java.util.Scanner;

public class test_CirclyLinked_List {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        circlyLinkedList<String> list=new circlyLinkedList<>();
        int choice =-1;
        System.out.println(" 1 : Add first \n"+
                "2 : Add last \n"+
                "3 : remove first \n"+
                "4 : rotate \n "+
                "0 : exit ");
        while (choice!=0){
            System.out.print(" Your choice is: ");
            choice=input.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print(" Input a Name:  ");
                    list.addfirst(input.next());
                    System.out.println(" first = "+list.first()+
                            "\tlast = "+list.last()+ "\t size = "+list.size());
                    break;
                case 2:
                    System.out.print(" Input a Name:  ");
                    list.addlast(input.next());
                    System.out.println(" first = "+list.first()+
                            "\tlast = "+list.last()+ "\t size = "+list.size());
                    break;
                case 3:
                    System.out.println(" Delete name = "+ list.removeFirst());
                    System.out.println(" first = "+list.first()+
                            "\tlast = "+list.last()+ "\t size = "+list.size());
                    break;
                case 4:
                   list.rotate();
                    System.out.println(" first = "+list.first()+
                            "\tlast = "+list.last()+ "\t size = "+list.size());
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}
