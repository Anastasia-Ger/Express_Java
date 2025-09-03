package practice_4.solvers;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        System.out.println(checkParity(4));
        System.out.println(checkParity(9));

        // check method: checkAge
        System.out.println(checkAge(4));
        System.out.println(checkAge(21));
        System.out.println(checkAge(71));

        // check method: checkMax - find max among 3 numbers
        System.out.println(checkMax(3, 7, 5
        ));
    }
    /**
     * method for checking parity of number
     * @param number
     * @return
     */
    public static String checkParity(int number) {
        //if-else
        // number % 2 == 0 - even
        // number % 2 == 1 - odd
        String parity = "Odd";
        if (number % 2 == 0) {
            parity = "Even";
        }
            return parity;
        }

    public static String checkAge(int age) {
        String ageDesctiption = "";
        if (age < 18) {
            ageDesctiption = "minor";
        }
        if (age >= 18 && age <= 60) {
            ageDesctiption = "adult";
        }
        if (age > 60) {
            ageDesctiption = "senior";
        }
        return ageDesctiption;
    }

    public static int checkMax (int a, int b, int c) {
        int maxAB = b;
        if (a > b) {
            maxAB = a;
        }
        int max = maxAB;
        if (c > maxAB) {
            max = c;
        }
        return max;
    }
}

