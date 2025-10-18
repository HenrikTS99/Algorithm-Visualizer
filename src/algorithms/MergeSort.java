package algorithms;
import java.util.Arrays;

public class MergeSort extends StepAlgorithm {
    int[] fullArr;

    @Override
    public void prepare(int[] input) {
        steps.clear();
        int[] arr = Arrays.copyOf(input, input.length);
        fullArr = Arrays.copyOf(input, input.length);
        mergeSort(arr, 0); // pass start index 0 for the full array
    }

    // recursivley divide array in 2, sort, re-combine
    // run-time complexity = O(n Log n)
    // space complexity = O(n)
    public void mergeSort(int[] arr, int startIndex) {
        int length = arr.length;
        if (length <= 1) {
            return;
        }

        int mid = length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, length);

        mergeSort(left, startIndex);
        mergeSort(right, startIndex + mid);
        merge(left, right, arr, startIndex);
    }

    public void merge(int[] left, int[] right, int[] arr, int startIndex) {

        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, l = 0, r = 0; // indices

        // check the conditions for merging
        while(l < leftSize && r < rightSize) {
            if(left[l] < right[r]) {
                arr[i++] = left[l++]; // post increment ( after variable is used)
            } else {
                arr[i++] = right[r++];
            }
            addSteptoFullArray(arr, startIndex);
        }
        while(l < leftSize) {
            arr[i++] = left[l++];
            addSteptoFullArray(arr, startIndex);
        }
        while (r < rightSize) {
            arr[i++] = right[r++];
            addSteptoFullArray(arr, startIndex);
        }
    }

    private void addSteptoFullArray(int[] arr, int startIndex) {
        for (int i = 0; i < arr.length; i++) {
            fullArr[startIndex + i] = arr[i];
        }
        steps.add(Arrays.copyOf(fullArr, fullArr.length));
    }
}
