import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Circle extends Shape {
    private int radius;

    public Circle(int x, int y) {
        super(x, y);
        this.radius = new Random().nextInt(30) + 20; // случайный радиус от 20 до 50
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }
}

class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int x, int y) {
        super(x, y);
        this.width = new Random().nextInt(40) + 20;
        this.height = new Random().nextInt(40) + 20;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

public class RandomShapes extends JPanel {
    public RandomShapes() {
        this.setPreferredSize(new Dimension(600, 400));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            int x = rand.nextInt(550);
            int y = rand.nextInt(350);
            if (rand.nextBoolean()) {
                new Circle(x, y).draw(g);
            } else {
                new Rectangle(x, y).draw(g);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new RandomShapes());
        frame.pack();
        frame.setVisible(true);
    }
}