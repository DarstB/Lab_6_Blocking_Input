import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int randomVal = rnd.nextInt(10) + 1;
        int guessVal = 0;
        boolean done = false;
        String trash;

        // Getting the user's guess
        System.out.print("Enter your guess (1-10): ");
        do {
            if(in.hasNextInt()) {
                guessVal = in.nextInt();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.print("The input " + trash + " is not a valid input. Try again: ");
            }
        }while(!done);
        done = false;

        if(randomVal > guessVal) {
            System.out.println("The random value of " + randomVal + " is higher than your guessed value of " + guessVal);
        }
        else if(randomVal < guessVal) {
            System.out.println("The random value of " + randomVal + " is lower than your guessed value of " + guessVal);
        }
        else {
            System.out.println("The random value of " + randomVal + " is equal than your guessed value of " + guessVal);
        }
    }
}
