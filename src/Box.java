import java.awt.*;
//Composite Pattern
public class Box extends MyShape {

    public Box(int x, int y) {
        super(x,y);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawRect(this.x,this.y,50,50);
    }
}
