import algorithms.SortingAlgorithm;

import javax.swing.*;
import java.awt.*;

public class AlgoPanel extends JPanel {
    int height = 100;
    int width = 200;
    int pixelSize = 5;
    AlgoDisplay algoDisplay;
    private final SortingAlgorithm algorithm;

    public AlgoPanel(SortingAlgorithm algorithm, RandNumArray randArrObj) {
        this.setPreferredSize(new Dimension(
                width * pixelSize, height * pixelSize
        ));
        this.setBackground(Color.BLUE);
        algoDisplay = new AlgoDisplay(randArrObj, height, width, pixelSize);
        this.add(algoDisplay);

        this.algorithm = algorithm;
        algorithm.prepare(randArrObj.getArray());

        this.repaint();
        algoDisplay.repaint();
    }

    public void updateStep() {
        int[] nextArr = algorithm.nextStep();
        if (nextArr != null) {
            algoDisplay.setArray(nextArr);
        }
    }
}
