package algorithms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public abstract class StepAlgorithm implements SortingAlgorithm {
    protected Queue<int[]> steps = new LinkedList<>();
    protected int stepCount = 0;
    protected int swapCount = 0;

    @Override
    public int[] nextStep() {
        return steps.poll();
    }

    protected void addStep(int[] arr, boolean swap) {
        steps.add(Arrays.copyOf(arr, arr.length));
        stepCount++;
        if (swap) swapCount++;
    }

    @Override
    public int getStepCount() { return stepCount; }
    @Override
    public int getSwapCount() { return swapCount; }
}
