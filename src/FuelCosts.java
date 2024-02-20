import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        double gasAmountInTank = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double distance = 0;
        double gasCostPer100 = 0;
        double numOfGallonsPer100;
        boolean done = false;
        String trash;

        Scanner in = new Scanner(System.in);

        // Getting amount of gas
        System.out.print("Enter the amount of gas (in gallons) in the tank: ");
        do{
            if(in.hasNextDouble()) {
                gasAmountInTank = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.print("The input " + trash + " is not a valid input. Try again: ");
            }
        } while(!done);
        done = false;

        // Getting the fuel efficiency
        System.out.print("Enter the fuel efficiency (mpg) of the vehicle: ");
        do{
            if(in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.print("The input " + trash + " is not a valid input. Try again: ");
            }
        } while(!done);
        done = false;

        // Getting price of gas
        System.out.print("Enter the price of gas: $");
        do{
            if(in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.print("The input " + trash + " is not a valid input. Try again: $");
            }
        } while(!done);
        done = false;

        // Calculating how far the car can go with the gas in the tank
        distance = gasAmountInTank * fuelEfficiency;

        // Calculating how much it would cost per 100 miles
        numOfGallonsPer100 = 100 / fuelEfficiency;
        gasCostPer100 = numOfGallonsPer100 * gasPrice;

        // Outputting
        System.out.println("The cost per 100 miles is $" + gasCostPer100);
        System.out.println("With the gas in the vehicle, the car can go " + distance + " miles");
    }
}
