import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountOfBricks;
        System.out.println("Enter an odd number between 50 and 100: ");
        amountOfBricks = scanner.nextInt();

        int containerCapacity;
        System.out.println("Enter an even number between 5 and 10: ");
        containerCapacity = scanner.nextInt();
        System.out.println("Your odd number is: " + amountOfBricks);
        System.out.println("Your even number is: " + containerCapacity);

        int fullContainers = amountOfBricks / containerCapacity;
        System.out.println("Our full containers: " + fullContainers);

        int leftBlocks = amountOfBricks % containerCapacity;
        System.out.println("Our remaining containers: " + leftBlocks);

        int total = (amountOfBricks + containerCapacity - 1) / containerCapacity;
        System.out.println("Our total containers: " + total);
    }
}
