import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        double length = 0;
        double width = 0;
        double diagonal = 0;
        double perimeter = 0;
        double area = 0;
        boolean done = false;
        String trash;

        Scanner in = new Scanner(System.in);

        // Get the length of rectangle
        System.out.print("Enter the length of the rectangle: ");
        do{
            if(in.hasNextDouble()) {
                length = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.print("The input " + trash + " is not a valid input. Try again: ");
            }
        }while(!done);
        done = false;

        // Get the height of rectangle
        System.out.print("Enter the width of the rectangle: ");
        do{
            if(in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.print("The input " + trash + " is not a valid input. Try again: ");
            }
        }while(!done);
        done = false;

        // Calculate the diagonal
        diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        // Calculate perimeter
        perimeter = (length * 2) + (width * 2);

        // Calculate area
        area = length * width;

        // Output results
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The diagonal of the rectangle is: " + diagonal);
    }
}
