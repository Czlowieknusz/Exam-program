import java.awt.*;

public abstract class Figure {
    private double r = 25, x, y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void draw(Graphics g) {
    }
}
