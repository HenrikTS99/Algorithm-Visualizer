package algorithms;

import java.util.LinkedList;
import java.util.Queue;

public abstract class StepAlgorithm implements SortingAlgorithm {
    protected Queue<int[]> steps = new LinkedList<>();

    @Override
    public int[] nextStep() {
        return steps.poll();
    }
}
