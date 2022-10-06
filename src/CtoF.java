import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done;
        double celcius = 0;
        String trash = "";

        System.out.println("enter the temprature in clecius to convert to fahrenheit: ");
        do {
            if (in.hasNextDouble()) {
                celcius = in.nextDouble();
                done = true;
            } else  {
                trash = in.nextLine();
                done = false;
                System.out.println( trash + " is not a valid number to convert");
            }
        }
        while (!done);
        System.out.println("The temprature in Fahrenheit is " + (celcius * 1.8 + 32));
    }
}