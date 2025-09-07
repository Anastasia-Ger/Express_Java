package practice_4.homework_solvers;

import java.util.Scanner;

public class SwitchSolver {
    public static void main(String[] args) {
     //   System.out.println("Current day of the week is: " + printDayOfWeek());
     //   System.out.println("The price of the ticket is: " + getTicketPriceByDay());
        System.out.println("Your grade is: " + convertScoreToGrade());
     //   printMessageForCommand();
     //   System.out.println("Result of calculation: " + calculator());


    }

    // 1 Method returns day of the week according to a number of the day
    public static String printDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print number from 1 to 7: ");
        int day = scanner.nextInt();
        String dayOfWeek = "";
        switch (day) {
            case (1) -> dayOfWeek = "Monday";
            case (2) -> dayOfWeek = "Tuesday";
            case (3) -> dayOfWeek = "Wednesday";
            case (4) -> dayOfWeek = "Thursday";
            case (5) -> dayOfWeek = "Friday";
            case (6) -> dayOfWeek = "Saturday";
            case (7) -> dayOfWeek = "Sunday";
            default -> dayOfWeek = "Invalid number";

        }
        return dayOfWeek;

    }
    // 2 Method returns ticket price according to the day of the week
    public static int getTicketPriceByDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print number from 1 to 7: ");
        int day = scanner.nextInt();
        int price = 0;
        switch (day) {
            case (1) -> price = 300;
            case (2) -> price = 300;
            case (3) -> price = 300;
            case (4) -> price = 300;
            case (5) -> price = 300;
            case (6) -> price = 450;
            case (7) -> price = 450;
        }
        return price;
    }
    // 3 Method converts score to grade
    public static String convertScoreToGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print your score: ");
        int score = scanner.nextInt();
        String grade = "";
        if (score == 100) {
            grade = "A";
        } else if (score < 0) {
            grade = "Invalid score";
        } else {
            switch (score / 10) {
                case 0, 1, 2, 3, 4, 5 -> grade = "F";
                case (6) -> grade = "D";
                case (7) -> grade = "C";
                case (8) -> grade = "B";
                case (9) -> grade = "A";
                default -> grade = "Invalid score";
            }
        }
        return grade;
    }
    // 4 Method reads a command and prints an according message
    public  static void printMessageForCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print command: ");
        String command = scanner.nextLine();
        switch (command) {
            case "Start":
                System.out.println("System started");
                break;
            case "Stop":
                System.out.println("System stopped");
                break;
            case "Restart":
                System.out.println("System restarted");
                break;
            case "Status":
                System.out.println("Status is off");
            default:
                System.out.println("Invalid command");
        }
    }
    // Method takes 2 numbers and math operator and returns the result of calculation
    public static  int calculator() {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int result = 0;
        String operator;
        System.out.println("Enter the first number: ");
        a = scanner.nextInt();
        System.out.println("Enter the operator: ");
        operator = scanner.next();
        System.out.println("Enter the second number: ");
        b = scanner.nextInt();

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Cannot divide by zero!");
                } else result = a / b;
                break;
        }
        return result;
    }

}
