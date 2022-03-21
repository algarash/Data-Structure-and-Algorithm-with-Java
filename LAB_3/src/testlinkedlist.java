import java.util.Scanner;

public class testlinkedlist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Single_Linkedlist<Integer> numlist=new Single_Linkedlist<>();
        numlist.addfirst(1);
        numlist.addlast(2);
        System.out.println("Size of list : "+ numlist.size());
        System.out.println(" First element is: "+numlist.first());
        System.out.println(" last element is: "+numlist.last());
        for (int i = 0; i <5 ; i++) {
            numlist.addlast(in.nextInt());

        }
        for (int i = 0; i <5 ; i++) {
            System.out.print(numlist.removefirst()+"\t");
        }
        System.out.println(" ");
        System.out.println("Size of list : "+ numlist.size());
        System.out.println(" First element is: "+numlist.first());
        System.out.println(" last element is: "+numlist.last());
    }
}
