import javax.swing.*;
import java.awt.*;

public class AlgoDisplay extends JPanel {
    int[] arr;
    int arrLength;
    int pixelSize = 4;

    AlgoDisplay(int[] arr) {
        //TODO pick algorithm
        this.arr = arr;
        arrLength = arr.length;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < arrLength; i ++) {
            int arrNum = arr[i];
            for (int pixel = 0; pixel < arrNum; pixel ++) {
                g.setColor(Color.BLACK);
                g.fillRect(i * pixelSize, pixel * pixelSize, pixelSize, pixelSize);
            }
        }

    }
}
