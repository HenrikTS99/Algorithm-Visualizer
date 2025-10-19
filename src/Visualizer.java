import javax.swing.*;

public class Visualizer {
    private final MainPanel mainPanel;
    private final TopPanel topPanel;
    private int delay = 100;
    private final Timer timer;

    public Visualizer() {
        mainPanel = new MainPanel();
        topPanel = new TopPanel(this);
        timer = new Timer(delay, _ -> nextFrame());
    }
    public void run() {
        new MyFrame(mainPanel, topPanel);
        timer.start();
    }

    public void setDelay(int newDelay) {
        this.delay = newDelay;
        timer.setDelay(newDelay);
    }

    public void nextFrame() {
        mainPanel.updateSteps();
        mainPanel.repaint();
    }

    public void resetAlgorithms() {
        mainPanel.resetAlgorithms();
    }

    public int getDelay() { return delay; }
}
