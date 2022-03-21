import java.util.Scanner;

public class testsingle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        SinglyLinkedlistStructure<String> list=new SinglyLinkedlistStructure<>();
        System.out.println("add student first  : ");
        list.addfirst(input.next());
        System.out.println("add student last  : ");
        list.addlast(input.next());
        System.out.println("Nuber of elements are "+ list.size);
        System.out.println(" first elment is : "+ list.first());
        System.out.println(" last elemnt is : "+ list.last());

        System.out.println(" To delete element from first click 1 ");
        int x=input.nextInt();
        if (x==1){
            for (int i = 0; i <= list.size() ; i++) {
                System.out.println(list.removeFirst());
            }
            System.out.println(" after removing");
            System.out.println("Nuber of elements are "+ list.size);
            System.out.println(" first elment is : "+ list.first());
            System.out.println(" last elemnt is : "+ list.last());
        }
    }
}
