import javax.swing.*;
import java.awt.*;

public class AlgoPanel extends JPanel {
    int height = 100;
    int width = 200;
    int pixelSize = 5;
    AlgoDisplay algoDisplay;

    public AlgoPanel(RandNumArray randArrObj) {
        this.setPreferredSize(new Dimension(
                width * pixelSize, height * pixelSize
        ));
        this.setBackground(Color.BLUE);
        algoDisplay = new AlgoDisplay(randArrObj, height, width, pixelSize);
        this.add(algoDisplay);
        this.repaint();
        algoDisplay.repaint();
    }
}
