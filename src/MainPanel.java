import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    int numAlgoPanels = 4;
    RandNumArray randArr;

    public MainPanel() {
        this.setLayout(new GridLayout(2, 2, 10, 10));

        randArr = new RandNumArray(100, 1, 100);
        randArr.printArray();
        addAlgoPanels();
    }

    public void addAlgoPanels() {
        for (int i = 0; i < numAlgoPanels; i++) {
            createAlgoPanel();
        }
    }

    public void createAlgoPanel() {
        AlgoPanel algoPanel = new AlgoPanel(randArr);
        this.add(algoPanel);
    }
}
