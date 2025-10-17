import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class RandNumArray {
    int[] arr;
    int maxValue;

    public RandNumArray(int minValue, int maxValue) {
        this.maxValue = maxValue;
        arr = IntStream.rangeClosed(minValue, maxValue).toArray();
        shuffleArray();
    }

    // Fisher-Yates shuffle
    private void shuffleArray() {
        Random rnd = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }

    public int[] getArray() { return arr; }
    public int getMaxValue() { return maxValue; }
}
