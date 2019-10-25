import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawCanvas extends JPanel  {
    MyShape shapeCollection;
    private JButton B;
    private JButton C;
    //Controller Pattern
    private CanvasController controller;

    public DrawCanvas(double len, JButton Box, JButton Circ){
        this.B = Box;
        this.C = Circ;

        setBackground(Color.white);

        controller = new CanvasController();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                controller.canvasClicked((int) e.getPoint().getX(),(int)e.getPoint().getY());
                shapeCollection = controller.getShapes();
                repaint();
            }
        });

        this.B.addActionListener(actionEvent -> controller.boxClicked());

        this.C.addActionListener(actionEvent -> controller.cirClicked());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(shapeCollection!=null) shapeCollection.draw(g);
    }
}
