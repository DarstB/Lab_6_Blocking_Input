import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        double tempF = 0;
        double tempC = 0;
        boolean done = false;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your temperature in C: ");

        do{
            if(in.hasNextDouble()) {
                tempC = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.print("The input " + trash + " is not a valid input. Try again: ");
            }
        } while(!done);

        tempF = (tempC * 9/5) + 32;
        System.out.println("The temperature in F is: " + tempF);
    }
}