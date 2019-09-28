import java.awt.*;
    //Composite pattern
public interface MyShape {

    Point getOrigin();
    void setOrigin(Point org);

    void paintComponent(Graphics g);
}

