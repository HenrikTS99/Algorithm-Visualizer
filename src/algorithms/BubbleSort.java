package algorithms;

import java.util.Arrays;

public class BubbleSort extends StepAlgorithm {

    @Override
    public void prepare(int[] input) {
        steps.clear();
        int[] arr = Arrays.copyOf(input, input.length);
        boolean swap = false;
        for (int i = 0; i < arr.length; i++) {
            swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                    addStep(arr, true);
                } else {
                    addStep(arr, false);
                }
            }
            if (!swap) { return; }
        }
    }
    @Override
    public String getAlgoName() {
        return "Bubble Sort";
    }
}
