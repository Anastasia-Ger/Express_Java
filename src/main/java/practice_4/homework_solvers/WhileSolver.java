package practice_4.homework_solvers;

import java.util.Scanner;

public class WhileSolver {
    public static void main(String[] args) {
        // System.out.println(factorialOfN());
        //printEvenNumbers();
        //printCountdownOfN();
    }
    // 1 Method returns a factorial of N
    public static int factorialOfN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int counter = 1;
        int product = 1;
        while (counter != n+1) {
            product = product * counter;
            counter++;
        }
        return product;
    }
    // 2 Method prints all even numbers from 1 to N
    public static void printEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int counter = 1;
        while (counter != n+1) {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
            counter++;
        }

    }
    // 3 Method prints countdown of N
    public static void printCountdownOfN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        while (n != 0) {
            System.out.println(n);
            n--;
        }
    }
}
