import java.util.Arrays;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = generateRandomArray(10, random);
        int[] minMax = findMinMax(array);

        System.out.println("Max: " + minMax[1]);
        System.out.println("Min: " + minMax[0]);
    }

    static int[] generateRandomArray(int size, Random r) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(101);
        }
        return arr;
    }

    static int[] findMinMax(int[] arr) {
        int min = Arrays.stream(arr).min().orElse(-1);
        int max = Arrays.stream(arr).max().orElse(-1);
        return new int[]{min, max};
    }
}
