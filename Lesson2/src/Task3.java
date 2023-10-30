import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int number;
        Random random = new Random();
        number = random.nextInt(100);

        System.out.println("Generated random number between 1 and 100 is: " + number);
        if(number % 2 == 0){
            System.out.println("The generated number is EVEN");
        }else{
            System.out.println("The generated number is ODD");
        }

    }
}
