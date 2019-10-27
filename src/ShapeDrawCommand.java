import java.util.EmptyStackException;
import java.util.Stack;
// Command Pattern
public class ShapeDrawCommand implements Command {

    CompositeMyShape sh;
    Stack<MyShape> undo;



    public ShapeDrawCommand(CompositeMyShape shapeReference, Stack<MyShape> undoStack){
        this.sh =shapeReference;
        this.undo = undoStack;
    }

    @Override
    public void execute(int x, int y, int style ) {
        //Making 3 classes for this seemed unnecessary...
        // Undo's would be more complicated if I had three separate classes to deal with
        // Since they're all MyShape objects, the composite treats them all the same
        MyShape shape;
        switch (style){
            case BOX:
                shape= new Box(x, y);
                this.sh.add(shape);
                break;
            case CIR:
                shape = new Circle(x, y);
                this.sh.add(shape);
                break;
            case STR:
                shape = new StrDisplay(x,y);
                this.sh.add(shape);
                break;
        }
        //Throw away our undo stack if a new object is created.
        this.undo.clear();

    }
    @Override
    public void undo() throws EmptyStackException {
        //Pop the MyShape from our stack of shapes and add it to the undo stack
        try {
            MyShape temp = this.sh.getAllShapes().pop();
            this.undo.push(temp);
        }
        catch (EmptyStackException e){
           System.out.println("Nothing to Undo!");
        }
    }

    @Override
    public void redo() throws EmptyStackException {
        //Pop the MyShape from our stack of undone shapes and add it back to the command stack
        try {
            this.sh.add(this.undo.pop());
        }
        catch (EmptyStackException e){
            System.out.println("Redo Cleared!");
        }

    }
}
