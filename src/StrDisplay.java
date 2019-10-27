import  java.awt.*;
public class StrDisplay extends MyShape {

    private  String txt = "Hello World!";
    public StrDisplay(int x, int y){
        super(x,y);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawString(txt, this.x,this.y);
    }
}
