public class InitState implements DrawState {
    // State pattern
    @Override
    public void Action(Context context) {
        context.setState(this);
    }

    @Override
    public MyShape doAction(int x, int y) {
       return  null;
    }
}
