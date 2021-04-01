package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandling {


    public static void main(String args[]) throws IOException {
//        createNewFile();
        numbersExceptionHandling();
        createNewFileRethrow();
    }


    private static void numbersExceptionHandling() {
        File file = new File("resource/numbers.txt");
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }

    }


    public static void createNewFile() {
        File file = new File("resource/nonexistance.txt");

        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Directory not exist");
            e.printStackTrace();

        }
    }

    private static void createNewFileRethrow() throws IOException {
        File file = new File("Resources/nonexistance.txt");
        file.createNewFile();
    }
}