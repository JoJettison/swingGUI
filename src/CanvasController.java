import java.util.Stack;

//Controller Pattern
public class CanvasController {
    private final int INIT = 0, BOX = 1, CIR = 2, STR =3;
    private int state = INIT;

    MyShape shapes;
    Stack<MyShape> undoStack;

    public CanvasController() {
        shapes = new CompositeMyShape();
        undoStack = new Stack<>();
    }

    public MyShape getShapes() {
        return shapes;
    }

    public void boxClicked() {
        state = BOX;
    }

    public void cirClicked() {
        state = CIR;
    }
    public void txtClicked(){
        state = STR;
    }

    public void undoClicked(){
        ShapeDrawCommand SDC = new ShapeDrawCommand((CompositeMyShape) shapes,undoStack);
        SDC.undo();

    }
    public  void redoClicked(){
        ShapeDrawCommand SDC = new ShapeDrawCommand((CompositeMyShape) shapes,undoStack);
        SDC.redo();
    }


    public void canvasClicked(int x, int y) {
        MyShape shape;
        ShapeDrawCommand SDC = new ShapeDrawCommand((CompositeMyShape) shapes,undoStack);

        switch (state) {
            case INIT:
                break;
            case BOX:
                SDC.execute(x,y,BOX);
                state = INIT;
                break;
            case CIR:
                SDC.execute(x,y,CIR);
                state = INIT;
                break;
            case STR:
                SDC.execute(x,y,STR);
                state = INIT;
                break;
        }
    }
}