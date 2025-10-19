package algorithms;

import java.util.Arrays;

public class InsertionSort extends StepAlgorithm {

    @Override
    public void prepare(int[] input) {
        steps.clear();
        int[] arr = Arrays.copyOf(input, input.length);

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                addStep(arr, true);
            }
            arr[j + 1] = key;
            addStep(arr, false);

        }
    }
    @Override
    public String getAlgoName() {
        return "Insertion Sort";
    }
}
