public class Context {
    //State Pattern
    private  DrawState current;

    public Context(){
        current = null;
    }

    public void setState(DrawState s){
        this.current =s ;
    }


    public DrawState getState(){
        return  current;
    }

    public MyShape doAction(int x, int y){
      return  current.doAction(x,y);
    }
}
