package DataStructur;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student [] team = new Student[3];
        for (int i = 0; i <team.length ; i++) {
            System.out.println("Enter name of student("+(i+1)+"):");
            team[i] = new Student(input.nextLine(),i+1);
        }

        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i].toString());
        }
    }
}
