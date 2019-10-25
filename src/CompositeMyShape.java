import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Composite Pattern
public class CompositeMyShape extends MyShape {
    Collection allShapes;

    public CompositeMyShape(){
        super(0,0);
         allShapes = new ArrayList<MyShape>();
    }

    public void add(MyShape sh){
        allShapes.add(sh);
    }

    @Override
    public void draw(Graphics graphics) {
        Iterator it = allShapes.iterator();
        while (it.hasNext()){
            ((MyShape) it.next()).draw(graphics);
        }
    }
}
