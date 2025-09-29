import java.util.Arrays;
import java.util.Random;

public class RandNumArray {
    int[] arr;
    int maxValue;
    int maxPossibleValue;
    int arrLength;

    public RandNumArray(int length, int minValue, int maxPossibleValue) {
        this.maxPossibleValue = maxPossibleValue;
        arrLength = length;
        arr = new int[length];

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(minValue, maxPossibleValue + 1);
        }
        maxValue = findMaxValue(); // Get max value from array after it is created
    }

    private int findMaxValue() {
        int highest = arr[0];
        for (int i = 1; i < arrLength; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
                if (highest == maxPossibleValue) {
                    return highest;
                }
            }
        }
        return highest;
    }

    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }

    public int[] getArray() { return arr; }
    public int getMaxPossibleValue() { return maxPossibleValue; }
    public int getMaxValue() { return maxValue; }
}
