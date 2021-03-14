package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static int MAX_TICKET_NUMBER = 7;

    public static void main(String args[]) {
        int[] varTicket = generateNumbers();
        Arrays.sort(varTicket);
        printTicket(varTicket);
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;

            /*Generate random number and compare with value in array to avoid duplicate value
             */
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));

            //value of this array should unique
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Sequencial searching of a value in an array
     *
     * @param paramArray          Array to searching in
     * @param paramNumberToSearch number to searching for
     * @return true if found, false if not found
     */
    public static boolean search(int[] paramArray, int paramNumberToSearch) {
        //Enhanced loop
        for (int value : paramArray) {
            if (value == paramNumberToSearch) {
                return true;
            }
        }
        return false;
    }


    public static boolean binarySearch(int[] array, int numberToSearchFor) {

        //Array must be sorted first
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearchFor);
        if (index >= 0) {
            return true;
        } else return false;
    }


    public static void printTicket(int[] paramTicket) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(paramTicket[i] + " | ");
        }
    }
}
