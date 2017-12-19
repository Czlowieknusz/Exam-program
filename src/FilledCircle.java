import java.awt.*;

public class FilledCircle extends Figure {
    private double r = 25, x, y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public FilledCircle(double x, double y) {
        this.x=x;
        this.y=y;

    }

    public void draw(Graphics g) {
        g.fillOval((int) (x - r), (int) (y - r), (int) (2 * r), (int) (2 * r));
    }
}
