import javax.swing.*;

public class Visualizer {
    private final MainPanel mainPanel;
    private final TopPanel topPanel;
    private int delay = 10;
    private final Timer timer;

    public Visualizer() {
        mainPanel = new MainPanel();
        topPanel = new TopPanel();
        timer = new Timer(delay, _ -> nextFrame());
    }
    public void run() {
        new MyFrame(mainPanel, topPanel);
        timer.start();
    }

    public void nextFrame() {
        mainPanel.updateSteps();
        mainPanel.repaint();


    }
}
