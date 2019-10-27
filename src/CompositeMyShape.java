import java.awt.*;
import java.util.Iterator;
import java.util.Stack;

//Composite Pattern
public class CompositeMyShape extends MyShape {
    Stack<MyShape> allShapes;

    public CompositeMyShape(){
        super(0,0);
         allShapes = new Stack<MyShape>();
    }

    public void add(MyShape sh){
        allShapes.push(sh);
    }

    public Stack<MyShape> getAllShapes(){
        return allShapes;
    }

    @Override
    public void draw(Graphics graphics) {
        Iterator<MyShape> it = allShapes.iterator();
        while (it.hasNext()){
            (it.next()).draw(graphics);
        }
    }
}
