import java.util.Scanner;
public class Q11{
    public static void main(String args[]) {
        Scanner yo = new Scanner(System.in);
        System.out.println("1 to convert from Fahrenheit to Celsius");
        System.out.println("2 to convert from Celsius to Fahrenheit");
        int selection = yo.nextInt();
        double far, cel;

        switch (selection) {
            case 1:
                System.out.print("Enter temperature in Fahrenheit: ");
                far = yo.nextDouble();
                cel = 5 / 9.0 * (far - 32);
                System.out.println("Temperature in Celsius: " + cel);
                break;

            case 2:
                System.out.print("Enter temperature in Celsius: ");
                cel= yo.nextDouble();
                far = 1.8 * cel + 32;
                System.out.println("Temperature in Fahrenheit: " + far);
                break;

            default:
                System.out.println("Wrong Selection");
                break;
        }
    }
}
