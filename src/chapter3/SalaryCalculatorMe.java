package chapter3;

import java.util.Scanner;

/*
if statement
Salespeople dapat salary $1000/minggu
penjualan > 10 dapat bonus $250
 */
public class SalaryCalculatorMe {

    public static void main (String arg[]) {

        //initialize known value
        int salary = 1000;
        int bonus = 250;
        int targetSales = 10;

        //get value for the unknown
        System.out.println("berapa penjualan dalam minggu ini:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        System.out.println("berapa banyak salespeople minggu ini:");
        int salesPeople = scanner.nextInt();

        System.out.println("berapa banyak salespeople dengan penjalan melebihi target (" + targetSales + "):");
        int salesPeopleBonus = scanner.nextInt();
        scanner.close();

        //quick detour for bonus and output
        if ( salesPeopleBonus <= salesPeople) {
            salary = (salary * salesPeople) + (salesPeopleBonus * bonus);
            System.out.println("Salary untuk salespeople minggu ini: $" + salary);
        }
        else {
            System.out.println("Salespeople dengan bonus invalid karena lebih besar dari salespeople");
        }
    }
}
