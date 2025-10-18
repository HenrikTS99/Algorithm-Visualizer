import javax.swing.*;
import java.awt.*;

public class AlgoDisplay extends JPanel {
    int[] arr;
    int arrLength;
    int pixelSize;
    int arrMaxValue;

    AlgoDisplay(RandNumArray randArrObj, int parentHeight, int parentWidth, int pixelSize) {
        this.arrMaxValue = randArrObj.getMaxValue();
        this.arr = randArrObj.getArray();
        this.pixelSize = pixelSize;
        arrLength = arr.length;
        this.setPreferredSize(new Dimension(
                (int) ((parentWidth * pixelSize) * 0.9), (int) ((parentHeight * pixelSize) * 0.9)
        ));
        this.setBackground(Color.BLACK);
    }

    public void setArray(int[] arr) {
        this.arr = arr;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = this.getWidth();
        int panelHeight = this.getHeight();
        int barWidth = panelWidth / arrLength;
        double scale = (double) panelHeight / arrMaxValue;

        for (int i = 0; i < arrLength; i ++) {
            // Color bars after value
            int greenVal = (255 / arrLength) * arr[i];
            int redVal = 255 - greenVal;
            g.setColor(new Color(redVal, greenVal, 0));

            int barHeight = (int) (arr[i] * scale);
            int x = barWidth * i;
            int y = panelHeight - barHeight; // top of the bar

            g.fillRect(x, y, barWidth, barHeight);
        }
    }

}
