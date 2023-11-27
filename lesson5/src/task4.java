import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First word: ");
        String firstWord = sc.nextLine();

        System.out.println("Second word: ");
        String secondWord = sc.nextLine();

        System.out.println(firstWord.concat(secondWord).equals(secondWord.concat(firstWord)));
    }
}
