import javax.swing.*;
import java.awt.*;

public class ImageDisplay {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("C:\\Users\\Rozenbaum\\IdeaProjects\\Rabotka_8\\гора.png");
           return;
        }

        String imagePath = args[0];

        JFrame frame = new JFrame("Image Display");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon(imagePath);

        JLabel label = new JLabel(imageIcon);

        frame.getContentPane().add(label);

        frame.pack();

        frame.setVisible(true);
    }
}
