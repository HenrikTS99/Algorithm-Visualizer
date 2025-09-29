import javax.swing.*;
import java.awt.*;

public class AlgoPanel extends JPanel {
    int height = 100;
    int width = 200;
    int pixelSize = 5;

    public AlgoPanel() {
        this.setPreferredSize(new Dimension(
                width * pixelSize, height * pixelSize
        ));
        this.setBackground(Color.BLUE);
    }
}
