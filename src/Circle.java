import java.awt.*;

public class Circle extends Figure {
    private double r = 25, x, y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Circle(double x, double y) {
        this.x=x;
        this.y=y;

    }
    @Override
    public void draw(Graphics g) {
        g.drawOval((int) (x - r), (int) (y - r), (int) (2 * r), (int) (2 * r));
    }
}
