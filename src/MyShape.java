import java.awt.*;
    //Composite pattern
public abstract class MyShape {

    int x,y;

    public MyShape(){
        this.x =0;
        this.y =0;
    }

    public MyShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract  void draw(Graphics graphics);

    public void add(MyShape s){

    }
}

