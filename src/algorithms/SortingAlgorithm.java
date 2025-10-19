package algorithms;

public interface SortingAlgorithm {
    void prepare(int[] arr);
    void reset();
    int[] nextStep();
    String getAlgoName();

    int getStepCount();
    int getSwapCount();
}
