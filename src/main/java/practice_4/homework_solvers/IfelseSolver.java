package practice_4.homework_solvers;

import java.util.Scanner;

public class IfelseSolver {
    public static void main(String[] args) {
    //    System.out.println(checkPositiveNegativeOrZero());
    //    System.out.println("The maximum number is: " + findMax());
    //    System.out.println(getGradeByScore());
    //    System.out.println(checkParity());
    //    determineDiscountByAge();
    //    getTestResultByScore();
    }

    // 1 Method checks whether a number is positive, negative or zero
    public static String checkPositiveNegativeOrZero() {
        Scanner scanner = new Scanner(System.in);
        String sign;
        int number = scanner.nextInt();
        if(number == 0) {
            sign = "Number is zero";
        } else if (number < 0) {
            sign = "Number is negative";

        } else {
            sign = "Number is positive";
        }
        return sign;
    }
    // 2 Method finds the maximum of two numbers
    public static int findMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the first number");
        int a = scanner.nextInt();
        System.out.println("Print the second number");
        int b = scanner.nextInt();
        if (a > b) {
            return a;
        } else return b;

    }
    // 3 Method returns the grade by the score
    public static String getGradeByScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print your score:");
        int score = scanner.nextInt();
        String grade = "";
        switch (score) {
            case 5:
                grade = "Excellent";
                break;
            case 4:
                grade = "Good";
                break;
            case 3:
                grade = "Satisfactory";
                break;
            case 2, 1:
                grade = "Unsatisfactory";
                break;
            default:
                grade = "Invalid grade";
        }
        return  grade;
    }
    // 4 Method checks parity (check the remainder by using modulo - %)
    public static String checkParity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        String parity = "";
        if (number % 2 == 0) {
            parity = "even";
        } else parity = "odd";
        return parity;
    }
    // 5 Method determine discount rate based on age
    public static void determineDiscountByAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print your age:");
        int age = scanner.nextInt();
        if (age <= 18) {
            System.out.println("You get 25% discount!");
        } else if (age >= 65) {
            System.out.println("You get 30% discount1");
        } else {
            System.out.println("No discount");
        }
    }
    // 6 Method describes test result by score
    public static void getTestResultByScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = scanner.nextInt();
        if (score < 0) {
            System.out.println("Score must not be negative");
        } else if (score > 0 && score < 60) {
            System.out.println("Your grade is unsatisfactory.");            
        } else if (score < 75) {
            System.out.println("Your grade is satisfactory.");
        } else if (score < 90) {
            System.out.println("Your grade is good!");
        } else if (score <= 100) {
            System.out.println("Your grade is excellent!");
        } else
            System.out.println("Score is invalid.");

    }


    }




