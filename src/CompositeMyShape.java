import java.awt.*;
import java.util.ArrayList;

//Composite Pattern
public class CompositeMyShape implements MyShape {

    public static final ArrayList<MyShape> shapes = new ArrayList<MyShape>();

    public void add(MyShape sh){
        shapes.add(sh);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.black);
        //Iterator Pattern
        for (MyShape sh: shapes) {
            sh.paintComponent(g);
        }
    }
}
