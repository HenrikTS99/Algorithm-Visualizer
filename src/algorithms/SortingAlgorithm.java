package algorithms;

public interface SortingAlgorithm {
    void prepare(int[] arr);
    int[] nextStep();
    String getAlgoName();

    int getStepCount();
    int getSwapCount();
}
