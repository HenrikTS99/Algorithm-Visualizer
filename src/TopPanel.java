import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopPanel extends JPanel {
    private final JLabel delayLabel = new JLabel();
    private final Visualizer visualizer;

    public TopPanel(Visualizer visualizer) {
        this.visualizer = visualizer;
        createResetButton();
        createDelaySlider(visualizer.getDelay());
    }

    private void createResetButton() {
        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizer.resetAlgorithms();
            }
        });
        this.add(resetButton);
    }

    // Slider for changing simulation speed logarithmically
    private void createDelaySlider(int currentDelay) {
        double minLog = Math.log(1); // min delay
        double maxLog = Math.log(1001); // max delay

        double normalizedStartValue = (Math.log(currentDelay) - minLog) / (maxLog - minLog); // normalize to 0-1
        // Map to slider range 1–100
        int sliderStartValue = (int) Math.round(normalizedStartValue * 100);
        JSlider delaySlider = new JSlider(1, 100, sliderStartValue);

        delaySlider.addChangeListener(_ -> {
            int sliderValue = delaySlider.getValue();
            double normalizedSliderValue = (double) sliderValue / 100.00; // normalize to 0-1
            int logValue = (int) Math.exp(minLog + normalizedSliderValue * maxLog);
            visualizer.setDelay(logValue);
            delayLabel.setText("Delay: " + logValue + " ms");
        });
        // Add text labels and slider
        this.add(new JLabel("Speed:"));
        this.add(delaySlider);
        delayLabel.setText("Delay: " + currentDelay + " ms");
        this.add(delayLabel);
    }
}
