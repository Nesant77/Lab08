import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String trash = "";

        double temp = 0;

        double far = 0;

        boolean done = false;
        do {
            System.out.println("enter the temperature in celsius: ");

            if (in.hasNextDouble()) {
                temp = in.nextDouble();
                in.nextLine();
                far = (temp * 1.8) + 32;
                System.out.println("Temperature in Fahrenheit is " + far);

                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not valid number");
            }
        } while (!done);

    }
}