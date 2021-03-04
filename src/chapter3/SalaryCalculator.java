package chapter3;

import java.util.Scanner;

/*
if statement
Salespeople dapat salary $1000/minggu
penjualan > 10 dapat bonus $250
 */
public class SalaryCalculator {

    public static void main (String arg[]) {

        //initialize known value

        int bonus = 250;
        int targetSales = 10;
        int salary = 1000;

        //get value for the unknown
        System.out.println("berapa penjualan dalam minggu ini:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        //quick detour for bonus
        if (sales > targetSales) {
            salary = salary + bonus;
        }

        //output
        System.out.println("Salary untuk salespeople minggu ini: $" + salary);
    }



}
