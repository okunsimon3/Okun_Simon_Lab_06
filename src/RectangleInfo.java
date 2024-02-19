import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        double recHeight = 0;
        double recWidth = 0;
        Scanner in = new Scanner(System.in);
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the height of your rectangle: ");
            if(in.hasNextDouble()) {
                recHeight = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " as the height of your rectangle");
                System.out.println("Please enter a valid number" + "\n");
            }
        }while (!done);
        done = false;
        do {
            System.out.print("\n" + "Enter the width of your rectangle: ");
            if(in.hasNextDouble()) {
                recWidth = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " as the width of your rectangle");
                System.out.println("Please enter a valid number");
            }
        }while (!done);
        System.out.println("\n" + "The area of your rectangle is " + (recWidth * recHeight));
        System.out.println("\n" + "The perimeter of your rectangle is " + ((recWidth * 2) + (recHeight * 2)));
        System.out.println("\n" + "The length of the diagonal of your rectangle is " + Math.sqrt(Math.pow(recWidth, 2) + Math.pow(recHeight, 2)));
    }
}
