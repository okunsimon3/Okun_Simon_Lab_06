import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        double numMeters = 0;
        Scanner in = new Scanner(System.in);
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter your measurement in meters: ");
            if(in.hasNextDouble()) {
                numMeters = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " as your measurement in meters");
                System.out.println("Please enter a valid number" + "\n");
            }
        }while (!done);
        System.out.println("\n" + "Your measurement of " + numMeters + " meters is equivalent to " + (numMeters * 0.0006213712) + " miles");
        System.out.println("\n" + "Your measurement of " + numMeters + " meters is equivalent to " + (numMeters * 3.280839895) + " feet");
        System.out.println("\n" + "Your measurement of " + numMeters + " meters is equivalent to " + (numMeters * 39.37007874) + " inches");
    }
}
