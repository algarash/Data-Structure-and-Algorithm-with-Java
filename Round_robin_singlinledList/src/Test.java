import java.util.Scanner;

public class Test  {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Round_R_Singly_linked_list procees_List=new Round_R_Singly_linked_list();
        for (int i = 0; i <5 ; i++) {
            System.out.print(" enter burst time for P"+i+": ");
            procees_List.new_process(input.nextInt());
        }
        System.out.print("first process is: "+procees_List.first_process());
        System.out.println("\tlast process is: "+procees_List.last_process());
        System.out.println("Number of Processes in the CPU : "+procees_List.noOfProcess());
        System.out.println("List of processes and their burst time: ");
        procees_List.printList();
//        System.out.println("List After time quantum will be: ");
    }

}
