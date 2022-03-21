import javax.sound.midi.SysexMessage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintFileConsole {
    public static void main(String[] args) throws FileNotFoundException {
        SinglyLinkedList_Queue<String> Queue=new SinglyLinkedList_Queue();
        Scanner input=new Scanner(System.in);
        System.out.println("Input File path to print");
        for (int i = 0; i <3 ; i++) {
            Queue.enqueue(input.next());
        }
        while (!Queue.isEmpty()){
            Scanner fileScanner = new Scanner(new File(Queue.dequeue()));
            while (fileScanner.hasNextLine()){
                System.out.println(fileScanner.nextLine());
            }
        }
    }
}
