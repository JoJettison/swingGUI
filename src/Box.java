import java.awt.*;
//Composite Pattern
public class Box implements MyShape {
    private Point origin;
    private double length;

    public Box(Point org, double length) {
        this.origin = org;
        this.length = length;
    }

    public Box(int x, int y, double length) {
        this(new Point(x, y), length);
    }

    @Override
    public void paintComponent(Graphics g) {
        int length = (int) this.length;
        g.setColor(Color.black);
        g.drawRect(origin.x, origin.y, length, length);
    }
}
