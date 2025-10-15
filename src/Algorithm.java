public class Algorithm {

    public static void bubbleSort(int[] arr) {
        int temp;
        boolean swap = false;
        for (int i = 0; i < arr.length; i++) {
            swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if (!swap) { return; }
        }
    }

    public static void bubbleSortOneStep(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    return;
                }
            }
        }
    }
}
