import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = new Color(new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256));
    }

    public abstract void draw(Graphics g);
}
