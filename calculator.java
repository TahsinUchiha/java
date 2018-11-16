import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First number: ");
        double x = input.nextInt();
        System.out.println("Second number: ");
        double y = input.nextInt();

        double Addition = x + y;
        double Subtraction = x - y;
        double Division = x / y;
        double Multiplication = x * y;
        

        System.out.println("Summation for " + x + " and " + y
                + " is: \t\t" + Addition);
        System.out.println("Subtraction for " + x + " and " + y
                + " is: \t\t" + Subtraction);
        System.out.println("Multiplication for " + x + " and " + y
                + " is: \t" + Multiplication);
        System.out.println("Division for " + x + " and " + y
                + " is: \t\t" + Division);
    }
}
