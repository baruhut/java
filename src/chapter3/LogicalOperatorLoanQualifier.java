package chapter3;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String arg[]){

        //initialize value known
        int minimumSalary = 30000;
        int minimumYears = 2;

        //get value unknown
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();

        System.out.println("Enter your work period:");
        int years = scanner.nextInt();
        scanner.close();

        //condition - output
        if (salary >= minimumSalary && years >= minimumYears){
                System.out.println("Your loan approved");
        }
        else {
            System.out.println("Your loan rejected");
        }
    }
}
