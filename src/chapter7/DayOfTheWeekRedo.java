package chapter7;

import java.util.Scanner;

public class DayOfTheWeekRedo {

    public static void main(String args[]) {

        //unknown value
        int varUserInput = getUserInput();

        //process - output
        printDayOfTheWeek(varUserInput);

    }


    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your number (1 - 7): ");
        int userInput = scanner.nextInt();
        scanner.close();
        return userInput;
    }

    public static void printDayOfTheWeek(int parmUserInput) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("The day is: " + daysOfWeek[parmUserInput - 1]);
    }
}
