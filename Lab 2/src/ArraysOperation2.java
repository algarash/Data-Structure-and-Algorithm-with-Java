import java.util.Arrays;
import java.util.Scanner;
public class ArraysOperation2 {
    int[]x;
    int numOfElements;

    public ArraysOperation2() {
        x = new int[5];
        numOfElements=0;
    }
    public int add(int e)
    {
        if (numOfElements<x.length)
        {
            x[numOfElements]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArraysOperation2 test= new ArraysOperation2();
        Scanner in= new Scanner(System.in);
        System.out.println("input elements");
        for (int i = 0; i <7 ; i++) {
            if (test.add(in.nextInt())==0)
                System.out.println("added sucessfully");
            else
                System.out.println("array is full");
            System.out.println(Arrays.toString(test.x));
        }
    }
}
