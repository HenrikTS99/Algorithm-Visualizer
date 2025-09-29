import java.util.Arrays;
import java.util.Random;

public class RandNumArray {
    int[] arr;

    public RandNumArray(int length, int minValue, int topValue) {
        arr = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(minValue, topValue + 1);
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }

    public int[] getArray() { return arr; }
}
