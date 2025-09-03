package practice_4.solvers;

public class ForTaskSolver {
    public static void main(String[] args) {
        // multiplyTable check
        multiplyTable(5);

        // sum of all numbers check
        System.out.println(sumOfAllNumber(4));

        // prime numbers check
        System.out.println(checkNumberIsPrime(11));
        System.out.println(checkNumberIsPrime(9));

        // check method that prints all prime numbers till 100
        printAllSimpleNumbersBefore100();

    }
    public static void multiplyTable(int number) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }

    public static int sumOfAllNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static boolean checkNumberIsPrime(int number) {
        boolean isSimple = true;

        for (int i = 2; i <= number-1; i++) {
            if (number % i == 0) {
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }

    public static void printAllSimpleNumbersBefore100() {
        for (int i = 2; i <=100; i++) {
            if (checkNumberIsPrime(i)) {
                System.out.println(i);
            }
        }
    }

}
