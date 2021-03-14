package chapter7;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Grades {

    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        System.out.println("input jumlah angka: ");
        grades = new int[scanner.nextInt()];

        getGrades();
        System.out.println("this is your average: " + String.format("%.2f", calculateAverage()));
        System.out.println("this is your highest: " + getHighest());
        System.out.println("this is your lowest: " + getLowest());
    }

    public static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("input your #" + (i + 1) + " number: ");
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum() {
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return sum;
    }

    public static double calculateAverage() {
        return calculateSum() / grades.length;
    }

    public static int getHighest() {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest() {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
