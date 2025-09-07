package practice_4.homework_solvers;

import java.util.Scanner;

public class DoWhileSolver {
    public static void main(String[] args) {
        //requestPositiveNumber();
        //requestPassword();
        //printNumbersFromOneToTen();
        //waitExit();
        System.out.println(countDigitsInInteger());
    }
    // Method requests a number until it is positive
    public static void requestPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        } while (number < 0);
        System.out.println("User entered positive number.");
    }
    // Method requests user's password
    public static void requestPassword() {
        Scanner scanner = new Scanner(System.in);
        String password = "admin22";
        String usersPassword = "";
        do {
            System.out.println("Plese enter your password: ");
            usersPassword = scanner.nextLine();
        } while (!password.equals(usersPassword));
        System.out.println("Password is correct.");
    }
    // Method prints numbers from 1 to 10
    public static void printNumbersFromOneToTen() {
        int counter = 1;
        do {
            System.out.println(counter);
            counter++;
        } while (counter != 11);
    }
    // Method reads commands until "Exit" is entered
    public static void waitExit() {
        Scanner scanner = new Scanner(System.in);
        String command = "Exit";
        String usersCommand = "";
        do {
            System.out.println("Enter command: ");
            usersCommand = scanner.nextLine();
        } while (!command.equals(usersCommand));
        System.out.println("Exit");
    }
    // Method counts digits in an integer
    public static int countDigitsInInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int counter = 0;
        do {
            number = number / 10;
            counter++;
        } while (number != 0);
        return counter;
    }

}
