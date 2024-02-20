import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        boolean done = false;
        String trash;

        Scanner in = new Scanner(System.in);

        // Get a measurement in meters
        System.out.print("Enter your measurement in meters: ");
        do{
            if(in.hasNextDouble()) {
                meters = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.print("The input " + trash + " is not a valid input. Try again: ");
            }
        }while(!done);
        done = false;

        // Calculations
        miles = meters / 1609;
        feet = meters * 3.281;
        inches = meters * 39.37;

        // Output
        System.out.println("The measurement you gave in meters is " + String.format("%.6f", miles) + " when converted to miles.");
        System.out.println("The measurement you gave in meters is " + feet + " when converted to feet.");
        System.out.println("The measurement you gave in meters is " + String.format("%.6f", inches) + " when converted to inches.");
    }
}
