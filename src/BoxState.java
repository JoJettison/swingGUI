public class BoxState implements DrawState {
    // State pattern
    private  static  BoxState instance = new BoxState();

    @Override
    public void Action(Context context) {
        context.setState(new BoxState());

    }

    public MyShape doAction(int x, int y){
        MyShape shape;
        shape = new Box(x, y);
        return  shape;
    }
}
