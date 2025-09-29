import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    int numAlgoPanels = 4;

    public MainPanel() {
        this.setLayout(new GridLayout(2, 2, 10, 10));

        addAlgoPanels();
    }

    public void addAlgoPanels() {
        for (int i = 0; i < numAlgoPanels; i++) {
            createAlgoPanel();
        }
    }

    public void createAlgoPanel() {
        AlgoPanel algoPanel = new AlgoPanel();
        this.add(algoPanel);
    }
}
