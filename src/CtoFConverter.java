import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        double cTemp = 0;
        double fTemp = 0;
        Scanner in = new Scanner(System.in);
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter your temperature in Celsius: ");
            if(in.hasNextDouble()) {
                cTemp = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " as your temperature");
                System.out.println("Please enter a valid number" + "\n");
            }
        }while (!done);
        fTemp = ((cTemp * (9/5)) + 32);
        System.out.println("\n" + "Your temperature, " + cTemp + " degrees Celsius, is " + fTemp + " degrees in Fahrenheit");
    }
}