import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        if (a == 0) {
            System.out.println("The value of 'a' cannot be zero for a quadratic equation.");
            return;
        }

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant == 0) {
            double x1 = -b / (2 * a);
            System.out.printf("The equation has one real root: x1 = %.2f%n", x1);
        } else if (discriminant > 0) {
            double x1Root = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2Root = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The equation has two real roots: x1 = %.2f, x2 = %.2f%n", x1Root, x2Root);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
