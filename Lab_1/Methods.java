package DataStructur;

import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {

        int[] array = new int[5];
        arrayinput(array);
        printArray(array);
    }
    public static void printArray(int[] array){
        System.out.print("{");
        for (int i:array) {
            System.out.print(" "+i);
        }
        System.out.print(" }");
    }
    public static void arrayinput(int[] array){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Enter number ("+(i+1)+") :");
            array[i] = input.nextInt();
        }
    }
}
