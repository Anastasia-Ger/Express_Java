package practice_4.homework_solvers;

import java.util.Scanner;

public class ForSolver {
    public static void main(String[] args) {
        // printNumbersDivisibleByThree();
        // System.out.println("Sum of N numbers is: " + sumOfNNumbers());
        // printMultiplicationTable();
        // if (isPrime()) {
        //    System.out.println("Number is prime.");
        // }
        //printNumbersFrom1to10();


    }
    // 1 Method prints numbers from 1 to 100 divisible by 3
    public static void printNumbersDivisibleByThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
    // 2 Method calculates sum of all numbers from 1 to n
    public static int sumOfNNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n+1; i++) {
            sum = sum + i;
        }
        return sum;
    }
    // 3 Method prints multiplication table for 1 number
    public static void printMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int result = 0;
        for (int i = 1; i < 11; i++) {
            result = i * number;
            System.out.println(i + " x " + number + " = " + result);
        }
    }
    // 4 Method checks if a number is prime
    public static boolean isPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < 10; i++) {
            if (i == number) {
                continue;
            }
            if (number % i == 0) {
                    isPrime = false;
                    System.out.println("Number is not prime");
                    break;
                }

        }
        return isPrime;
    }
    // 5 Method prints numbers from 1 to 10
    public static void printNumbersFrom1to10() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }


}
