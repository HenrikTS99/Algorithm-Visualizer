import algorithms.BubbleSort;
import algorithms.InsertionSort;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    int numAlgoPanels = 4;
    RandNumArray randArr;
    private AlgoPanel[] algoPanels = new AlgoPanel[numAlgoPanels];

    public MainPanel() {
        this.setLayout(new GridLayout(2, 2, 10, 10));

        randArr = new RandNumArray(100, 1, 100);
        randArr.printArray();
        addAlgoPanels();
    }

    public void addAlgoPanels() {
        algoPanels[0] = new AlgoPanel(new BubbleSort(), randArr);
        algoPanels[1] = new AlgoPanel(new InsertionSort(), randArr);
        algoPanels[2] = new AlgoPanel(new InsertionSort(), randArr);
        algoPanels[3] = new AlgoPanel(new BubbleSort(), randArr);
        for (AlgoPanel panel : algoPanels) {
            this.add(panel);
        }
    }
    public void updateSteps() {
        for (AlgoPanel panel : algoPanels) {
            panel.updateStep();
        }
    }

}
