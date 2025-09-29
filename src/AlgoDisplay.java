import javax.swing.*;
import java.awt.*;

public class AlgoDisplay extends JPanel {
    int[] arr;
    int arrLength;
    int pixelSize;
    int arrMaxValue;

    AlgoDisplay(RandNumArray randArrObj, int parentHeight, int parentWidth, int pixelSize) {
        //TODO pick algorithm
        this.arrMaxValue = randArrObj.getMaxValue();
        this.arr = randArrObj.getArray();
        this.pixelSize = pixelSize;
        arrLength = arr.length;
        this.setPreferredSize(new Dimension(
                (int) ((parentWidth * pixelSize) * 0.9), (int) ((parentHeight * pixelSize) * 0.9)
        ));
        this.setBackground(Color.BLACK);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = this.getWidth() / arrLength;
        int height = this.getHeight() / arrMaxValue;
        int y = this.getHeight();
        g.setColor(Color.GREEN);
        for (int i = 0; i < arrLength; i ++) {
            int arrNum = arr[i];
            int x = width * i;
            g.fillRect(x, y, width, -(height * arrNum));
        }

    }

}
