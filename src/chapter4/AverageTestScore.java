package chapter4;

import java.util.Scanner;

public class AverageTestScore {

    public static void main(String args[]) {
        //input value known
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //process
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Input student id number:");
            int idStudent = scanner.nextInt();

            double total = 0;

            for (int j = 0; j < numberOfTests; j++) {
                System.out.print("Input nilai ujian pelajaran #" + (j + 1) + ": ");
                double score = scanner.nextDouble();
                total = total + score;
            }
            double averageScore = total / numberOfTests;
            System.out.println("Nilai rata-rata murid dengan id " + idStudent + " adalah: " + averageScore);
        }

    }
}
