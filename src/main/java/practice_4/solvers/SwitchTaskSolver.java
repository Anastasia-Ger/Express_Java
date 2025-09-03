package practice_4.solvers;

import practice_4.Season;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        // check method: dayOfWeek() - return day of week by a number
        System.out.println(dayOfWeek(5));
        System.out.println(dayOfWeek(15));

        // check method: describeSeason()
        System.out.println(describeSeason(Season.WINTER));
        System.out.println(describeSeason(Season.SPRING));
    }
    static String dayOfWeek = " ";
    public static String dayOfWeek(int day) {
        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            default:
                dayOfWeek = "Non-existing day of week";
                break;
        }
        return dayOfWeek;
    }

    public static String describeSeason(Season season) {
        String description = "";
        switch (season) {
            case WINTER -> description = "Winter - cold and snowy.";
            case SUMMER -> description = "Summer - hot.";
            case AUTUMN -> description = "Autumn - rainy and cloudy.";
            case SPRING -> description = "Spring - everything blooms.";
        }
        return description;
    }

}
