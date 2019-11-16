public class CircleState implements DrawState {
    // State Pattern
    private  static  CircleState instance = new CircleState();

    @Override
    public void Action(Context context) {
        context.setState(this);

    }

    public MyShape doAction(int x, int y){
        MyShape shape;
        shape = new Circle(x, y);
        return  shape;
    }
}
