package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String arg[]) {
        System.out.println("Enter your season:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Enter number of cups:");
        int cup = scanner.nextInt();

        System.out.println("Enter your adjective:");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, i drink a minimum of " + cup + " cups ofcoffee");

    }
}
