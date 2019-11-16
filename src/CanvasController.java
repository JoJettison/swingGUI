
//Controller Pattern
public class CanvasController {
    //State instances
    DrawState bx = new BoxState();
    DrawState ce = new CircleState();
    DrawState in = new InitState();

    Context ctrlContext = new Context();
    MyShape shapes;

    public CanvasController() {
        shapes = new CompositeMyShape();
    }

    public MyShape getShapes() {
        return shapes;
    }

    public void boxClicked() {
        ctrlContext.setState(bx);
    }

    public void cirClicked() { ctrlContext.setState(ce); }

    public void canvasClicked(int x, int y) {
        try {
            shapes.add( ctrlContext.doAction(x,y));
            ctrlContext.setState(in);
        }
        catch (Exception e){}
        }

}