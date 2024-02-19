import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        double numGallons = 0;
        double fuelEfficiency = 0;
        double gallonPrice = 0;
        Scanner in = new Scanner(System.in);
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the number of gallons in your vehicle's tank: ");
            if(in.hasNextDouble()) {
                numGallons = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " as the number of gallons in your vehicle's tank");
                System.out.println("Please enter a valid number" + "\n");
            }
        }while (!done);
        done = false;
        do {
            System.out.print("\n" + "Enter the fuel efficiency of your vehicle in miles per gallon: ");
            if(in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " as your vehicle's fuel efficiency in miles per gallon");
                System.out.println("Please enter a valid number");
            }
        }while (!done);
        done = false;
        do {
            System.out.print("\n" + "Enter the price of gas per gallon: ");
            if(in.hasNextDouble()) {
                gallonPrice = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " as the price of gas per gallon");
                System.out.println("Please enter a valid number");
            }
        }while (!done);
        System.out.println(String.format("The cost of driving 100 miles is: $" + "%,.2f", ((100 / fuelEfficiency) * gallonPrice)) + "\n");
        System.out.println("You can travel " + (numGallons * fuelEfficiency) + " miles with a full tank of gas");
    }
}
