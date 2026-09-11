package oop.assigment_problems;

public class DayNameFinder {

    public static void printDayName(int dayNumber) {
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid Day";
                break;
        }
        System.out.println(dayName);
    }

    public static void main(String[] args) {
        printDayName(1);
        printDayName(5);
        printDayName(9);
    }
}
