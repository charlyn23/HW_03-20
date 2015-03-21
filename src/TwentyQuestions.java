/** Access Code
 * Created by charlynbuchanan on 3/17/15.
 * This guessing game produces a random number between 1 and 100,000(inclusive). User guesses the number based on prompts. User has 20
 * chances to guess the number. Guesses are counted by program. When there are no more chances, program tells user
 * what the number was. If user guesses, program says "You guessed it!"
 */

import java.util.Random;
import java.util.Scanner;



public class TwentyQuestions {
    public static int randInt() {
        Random rand = new Random();
        int randomNum = rand.nextInt(100000) + 1;
        return randomNum;

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int guess;

        System.out.println("I've randomly selected a number between 1 and 100,000. You have twenty chances \n" +
                "to guess.");
        guess = input.nextInt();
        int randomNum = randInt();
        int guesses;


        for (int i = 20; i > 0; i--) {
            // guess = input.nextInt();

            while (guess != randomNum) {

                if (guess < 1 || guess > 100000) {
                    System.out.println("Please select a number between 1 and 100,000. You have " + (i -= 1) + " guesses left.");
                    //return;
                } else if (guess < randomNum) {
                    System.out.println("Too small. You have " + (i -= 1) + " guesses left");
                    //return;
                } else if (guess > randomNum) {
                    System.out.println("Too big. You have " + (i -= 1) + " guesses left");
                    //return;
                }
                if (i == 0) {
                    System.out.println("The number was " + randomNum  +".");
                    return;
                }
                guess = input.nextInt();
            }

            System.out.println("You guessed it!");
            break;


            //System.out.print(randInt());
        }
    }
}







