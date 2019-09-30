import java.awt.*;
//Composite Pattern
public class Circle implements MyShape {
    private  Point origin;
    private  double diameter;

    public  Circle(Point org, double diameter){
        this.origin = org;
        this.diameter = diameter;
    }
    public  Circle(int x, int y, double diameter){
        this(new Point(x,y),diameter);
    }

    @Override
    public void setOrigin(Point org){
        this.origin = org;
    }
    @Override
    public void paintComponent(Graphics g){
        int diameter = (int) this.diameter;
        g.setColor(Color.black);
       //g.fillOval(origin.x, origin.y,diameter,diameter);
        g.drawOval(origin.x, origin.y,diameter,diameter);
    }

}
