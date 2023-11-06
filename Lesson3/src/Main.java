import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter the type of operation (+, -, *, /): ");
        String operation = sc.next();
        int result = performOperations(firstNumber, secondNumber, operation);
        System.out.println("Your answer is: " + result);
    }

    private static int performOperations(int firstNumber, int secondNumber, String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Error");
                break;
        }
        return result;
    }
}