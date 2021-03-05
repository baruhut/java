package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    //value known
    static int minSalary = 25000;
    static int minCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        double varSalary = getSalary();
        int varCreditScore = getCreditScore();
        scanner.close();

        //check user qualification
        boolean varQualified = isUserQualified(varCreditScore, varSalary);

        //notify user
        notifyUser(varQualified);
    }

    public static double getSalary() {
        System.out.println("Entry your salary: ");
        double inputSalary = scanner.nextDouble();
        return inputSalary;
    }

    public static int getCreditScore() {
        System.out.println("Entry your credit score: ");
        int inputCreditScore = scanner.nextInt();
        return inputCreditScore;
    }

    public static boolean isUserQualified(int paramCreditScore, double paramSalary) {
        if (paramCreditScore >= minCreditScore && paramSalary >= minSalary) {
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser(boolean paramQualified) {
        if (paramQualified) {
            System.out.println("Congrats");
        } else {
            System.out.println("too bad");
        }
    }
}
