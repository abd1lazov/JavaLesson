public class task1 {
    public static void main(String[] args) {
        int[] array = createArray(10);
        printArray(array);
    }

    static int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = size - 1 - i;
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.println(n + " ");
        }
    }
}