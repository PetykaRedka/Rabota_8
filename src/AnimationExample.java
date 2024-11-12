import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class AnimationExample {
    private static int currentFrame = 0;
    private static String[] frames = {
            "гора.png", "горы.png"};

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Animation");
        JLabel label = new JLabel();
        frame.add(label);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                ImageIcon icon = new ImageIcon(frames[currentFrame]);
                label.setIcon(icon);
                currentFrame = (currentFrame + 1) % frames.length;
            }
        }, 0, 1000);

        frame.setVisible(true);
    }
}
