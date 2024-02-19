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
                System.out.println("You entered " + trash + " as ");
            }
        }while (!done);
    }
}
