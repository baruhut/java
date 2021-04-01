package chapter5;

import java.util.Scanner;

public class PhoneBillCalculatorRedo1 {

    //known value
    static double overageCharge = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        //unknown value
        double planFeeCost = getPlanFeeCost();
        int overageMinute = getOverageMinute();
        scanner.close();

        //process
        double userCharge = countUserOverageCharge(overageMinute);
        double userChargeAndTax = countUserTax(userCharge);
        //double userTotalCharge = countUserTotalCharge(planFeeCost, userChargeAndTax);

        //output
        printBill(planFeeCost, userCharge, userChargeAndTax);
        //plan, overage, tax, total
    }

    public static double getPlanFeeCost() {
        System.out.println("Enter base cost of the plan:");
        double planFeeCost = scanner.nextDouble();
        return planFeeCost;
    }

    public static int getOverageMinute() {
        System.out.println("Enter overage minute:");
        int overageMinute = scanner.nextInt();
        return overageMinute;
    }

    public static double countUserOverageCharge(int paramOverageMinute) {
        double userOverageCharge = overageCharge * paramOverageMinute;
        return userOverageCharge;
    }

    public static double countUserTax(double paramUserCharge) {
        double userTax = tax * paramUserCharge;
        return userTax;
    }

    public static double countUserTotalCharge(double paramPlanFeeCost, double paramUserTax) {
        double userTotalCharge = paramPlanFeeCost + paramPlanFeeCost;
        return userTotalCharge;
    }

    public static void printBill(double paramPlanFeeCost, double paramUserCharge, double paramUserChargeAndTax) {
        double userTotalCharge = paramPlanFeeCost + paramUserCharge + paramUserChargeAndTax;
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + paramPlanFeeCost);
        System.out.println("Overage: $" + paramUserCharge);
        System.out.println("Tax: $" + paramUserChargeAndTax);
        System.out.println("Total: $" + userTotalCharge);
    }
}
