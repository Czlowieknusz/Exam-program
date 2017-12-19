import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class CirclePanel extends JPanel implements MouseListener, MouseMotionListener {

    private Figure circle;
    private boolean isClicked = true;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (circle != null) {
            circle.draw(g);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (circle != null) {
            circle.setX(e.getX());
            circle.setY(e.getY());
            repaint();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (!isClicked) {
            circle = new FilledCircle(e.getX(), e.getY());
            isClicked = true;
        } else {
            circle = new Circle(e.getX(), e.getY());
            isClicked = false;
        }
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (!isClicked) {
            circle = new FilledCircle(e.getX(), e.getY());
        } else {
            circle = new Circle(e.getX(), e.getY());
        }
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        circle = null;
        repaint();
    }
}
