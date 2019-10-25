import java.awt.*;
//Composite Pattern
public class Circle extends MyShape {

    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 50, 50);
    }


}
