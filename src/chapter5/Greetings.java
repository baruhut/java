package chapter5;

import chapter3.SalaryCalculator;

import java.util.Scanner;

public class Greetings {

    public static void main(String args[]) {
        System.out.println("Input nama anda: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }

    public static void greetUser(String name) {
        System.out.println("hallo, " + name);
    }
}
