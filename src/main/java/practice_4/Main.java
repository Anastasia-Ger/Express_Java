package practice_4;

import practice_4.solvers.IfElseTaskSolver;
import practice_4.solvers.SwitchTaskSolver;

public class Main {
    public static void main(String[] args) {

        IfElseTaskSolver ifElseTaskSolver = new IfElseTaskSolver();
        // check method: checkParity
        System.out.println(ifElseTaskSolver.checkParity(4));
        System.out.println(ifElseTaskSolver.checkParity(9));

        // check method: checkAge
        System.out.println(ifElseTaskSolver.checkAge(4));
        System.out.println(ifElseTaskSolver.checkAge(21));
        System.out.println(ifElseTaskSolver.checkAge(71));

        // check method: checkMax - find max among 3 numbers
        System.out.println(ifElseTaskSolver.checkMax(3, 7, 5
        ));

        SwitchTaskSolver switchTaskSolver = new SwitchTaskSolver();

        // check method: dayOfWeek() - return day of week by a number
        System.out.println(switchTaskSolver.dayOfWeek(5));
        System.out.println(switchTaskSolver.dayOfWeek(15));

        // check method: describeSeason()
        System.out.println(switchTaskSolver.describeSeason(Season.WINTER));
        System.out.println(switchTaskSolver.describeSeason(Season.SPRING));


    }
}
