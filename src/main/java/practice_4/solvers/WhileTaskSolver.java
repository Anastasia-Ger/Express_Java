package practice_4.solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {

        printAllNumbersBefore10();

     //   commandReader();

    }
    public static void printAllNumbersBefore10() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void commandReader() {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!command.equals("exit")) {
            System.out.println("Enter a command: ");
            command = scanner.nextLine();
        }
        System.out.println("Programm finished");
    }
}
