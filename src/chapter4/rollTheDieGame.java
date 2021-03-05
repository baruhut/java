package chapter4;

import java.util.Random;

/*

 */
public class rollTheDieGame {

    public static void main(String args[]) {
        //input - value known
        int spacesFinal = 20;
        int dieRolls = 5;
        int spaceNow = 0;
        int remainSpace = 0;
        int numberDie = 6;
        Random random = new Random();

        //process
        for (int i = 0; i < dieRolls; i++) {
            int die = random.nextInt(numberDie) + 1;
            spaceNow = spaceNow + die;
            if (spaceNow < spacesFinal) {
                remainSpace = spacesFinal - spaceNow;
                System.out.println("Roll #" + (i + 1) + " you have rolled a " + die + ". You are now on space " + spaceNow + " and have " + remainSpace + " to go");
            } else if (spaceNow > spacesFinal) {
                System.out.println("Sorry you lose for having space more than " + spacesFinal);
                break;
            } else {
                System.out.println("You have reach " + spacesFinal + " You have WON");
                break;
            }
        }

        if (spaceNow < spacesFinal) {
            System.out.println("Sorry you lose for having space less than " + spacesFinal);
        }

        //output
    }
}
