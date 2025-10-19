import algorithms.SortingAlgorithm;

import javax.swing.*;
import java.awt.*;

public class AlgoPanel extends JPanel {
    int height = 100;
    int width = 200;
    int pixelSize = 5;
    AlgoDisplay algoDisplay;
    private final SortingAlgorithm algorithm;

    private final JLabel algoLabel = new JLabel();
    private final JLabel stepLabel = new JLabel("Steps: 0");
    private final JLabel swapLabel = new JLabel("Swaps: 0");

    public AlgoPanel(SortingAlgorithm algorithm, RandNumArray randArrObj) {
        this.setPreferredSize(new Dimension(
                width * pixelSize, height * pixelSize
        ));
        this.setLayout(new BorderLayout());
        this.setBackground(Color.BLACK);

        algoDisplay = new AlgoDisplay(randArrObj, height, width, pixelSize);
        this.add(algoDisplay, BorderLayout.SOUTH);

        this.algorithm = algorithm;
        algorithm.prepare(randArrObj.getArray());

        createInfoPanel();
        this.repaint();
        algoDisplay.repaint();
    }

    private void createInfoPanel() {
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 150, 0));
        infoPanel.setBackground(Color.black);
        // Algo name display
        algoLabel.setText(algorithm.getAlgoName());

        // Style and add all labels
        for (JLabel label : new JLabel[]{algoLabel, swapLabel, stepLabel}) {

            label.setFont(new Font("Serif", Font.PLAIN, 24));
            label.setForeground(Color.WHITE);
            infoPanel.add(label);
        }
        updateCountLabels();
        this.add(infoPanel, BorderLayout.NORTH);
    }

    public void updateStep() {
        int[] nextArr = algorithm.nextStep();
        if (nextArr != null) {
            algoDisplay.setArray(nextArr);
            //updateCountLabels();
        }
    }

    private void updateCountLabels() {
        swapLabel.setText("Swaps: " + algorithm.getSwapCount());
        stepLabel.setText("Steps: " + algorithm.getStepCount());
    }
}
