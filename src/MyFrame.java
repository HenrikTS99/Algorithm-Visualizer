import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    private final JFrame frame;

    public MyFrame(MainPanel mainPanel, TopPanel topPanel) {
        this.frame = new JFrame();
        this.frame.setTitle("Algorithm Visualizer");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setResizable(false);

        // Menu bar
        this.frame.add(topPanel, BorderLayout.NORTH);

        // Main display
        this.frame.add(mainPanel, BorderLayout.CENTER);
        this.frame.pack(); // Adjust frame size to fit panel
        this.frame.setLocationRelativeTo(null); // Center

        this.frame.setVisible(true);
    }
}
