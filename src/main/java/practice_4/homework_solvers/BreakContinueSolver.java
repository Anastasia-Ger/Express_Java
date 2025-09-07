package practice_4.homework_solvers;

import java.util.Scanner;

public class BreakContinueSolver {
    public static void main(String[] args) {
        //System.out.println("Sum of positive numbers is: " + sumOfPositives());
        //printNumbersExceptDivisibleByThree();
        //printPositives();
        //readCommandsUntilStop();

    }
    // 1 Method requests numbers from user and returns their sum. Program stops when user enters negative number
    public static int sumOfPositives() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        while (number >= 0) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("End of program: negative number entered.");
                break;
            } else {
                sum = sum + number;
            }
        }
        return sum;
    }
    // 2 Method skips numbers divisible by 3 and prints all other numbers
    public static void printNumbersExceptDivisibleByThree() {
        for (int i=1; i < 21; i++) {
            if (i % 3 == 0) {
                continue;
            } else {System.out.println(i);}
        }
    }
    // 3 Method prints positive numbers and skips negative ones
    public static void printPositives() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int number = 0;
        while (counter != 11) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            if (number < 0) {
                continue;
            } else {
                System.out.println("Positive number is: " + number);
                counter++;
            }
        }
    }
    // 4 Method requests commands from user until "stop" is entered
    public static void readCommandsUntilStop() {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        String command = "";
        String stopWord = "stop";
        while (condition) {
            System.out.println("Enter a command: ");
            command = scanner.nextLine();
            if (command.equals(stopWord)) {
                System.out.println("Program stops.");
                condition = false;
                break;
            }
        }
    }
}
