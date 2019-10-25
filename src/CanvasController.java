
//Controller Pattern
public class CanvasController {
    private final int INIT = 0, BOX = 1, CIR = 2;
    private int state = INIT;
    MyShape shapes;

    public CanvasController() {
        shapes = new CompositeMyShape();
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

    public void canvasClicked(int x, int y) {
        switch (state) {
            case INIT:
                break;
            case BOX:
                MyShape shape = new Box(x, y);
                shapes.add(shape);
                state = INIT;
                break;
            case CIR:
                shape = new Circle(x, y);
                shapes.add(shape);
                state = INIT;
                break;
        }
    }
}