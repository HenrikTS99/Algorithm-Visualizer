package algorithms;

import java.util.Arrays;

public class SelectionSort extends StepAlgorithm {

    @Override
    public void prepare(int[] input) {
        steps.clear();
        int[] arr = Arrays.copyOf(input, input.length);
        for (int i = 0; i < arr.length; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if ( arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
                addStep(arr, false);
            }
            if ( smallestIndex != i) {
                int temp = arr[i];
                arr[i] = arr[smallestIndex];
                arr[smallestIndex] = temp;
                addStep(arr, true);
            }
        }
        addStep(arr, false);
    }

    @Override
    public String getAlgoName() {
        return "Selection Sort";
    }
}
