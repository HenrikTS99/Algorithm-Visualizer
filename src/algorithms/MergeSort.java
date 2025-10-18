package algorithms;
import java.util.Arrays;

public class MergeSort extends StepAlgorithm {

    @Override
    public void prepare(int[] input) {
        steps.clear();
        int[] arr = Arrays.copyOf(input, input.length);
        int[] aux = new int[arr.length]; // auxiliary array / helper array
        mergeSort(arr, aux, 0, arr.length - 1); // start recursive merge sort
    }

    // recursively divide array in 2, sorts each half, re-combine
    // run-time complexity = O(n Log n)
    // space complexity = O(n)
    public void mergeSort(int[] arr, int[] aux, int left, int right) {
        // base case: single element means sorted
        if (left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(arr, aux, left, mid); // recursively sort left half
        mergeSort(arr, aux, mid + 1, right); // recursively sort right half
        // merge the two halves together
        merge(arr, aux, left, mid, right);
    }

    /**
     * Merges two sorted halves of arr[left, mid] and arr[mid+1, right] into a single sorted section.
     * Records each step for visualization
     */
    public void merge(int[] arr, int[] aux, int left, int mid, int right) {
        // copy current section to helper array so can safely compare while writing into arr
        // Arguments: source, starting index in source, destination array, starting index in destination, number of elements to copy
        if (right + 1 - left >= 0) System.arraycopy(arr, left, aux, left, right - left + 1);

        // i: pointer for left half
        // j: pointer for right half
        // k: position currently writing to in arr
        int i = left, j = mid + 1, k = left;

        // merge both halves while both have elements left
        while (i <= mid && j <= right) {
            if (aux[i] <= aux[j]) {
                arr[k++] = aux[i++]; // copy from left half if smaller
            } else {
                arr[k++] = aux[j++]; // post increment ( after variable is used)
            }
            steps.add(Arrays.copyOf(arr, arr.length));
        }
        // copy remaining elements
        while (i <= mid) {
            arr[k++] = aux[i++];
        }
        while (j <= right) {
            arr[k++] = aux[j++];
            steps.add(Arrays.copyOf(arr, arr.length));
        }
        // final step snapshot of this merge operation
        steps.add(Arrays.copyOf(arr, arr.length));
    }
}

