package chapter4;

import java.util.Scanner;

public class LetterSearch {

    public static void main(String args[]) {

        //get text
        System.out.print("input satu kata: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        //System.out.print("input karakter huruf yang dicari: ");
        //String letter = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //search for a letter
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }
        if (letterFound) {
            System.out.println("hurus A ditemukan");
        } else {
            System.out.println("huruf A tidak ditemukan");
        }
    }
}
