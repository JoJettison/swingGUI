import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawCanvas extends JPanel  {
    private CompositeMyShape shapeCollection = new CompositeMyShape();
    private double length;
    private int mode;
    private JButton B;
    private JButton C;
    //Controller Pattern
    public DrawCanvas(double len, JButton Box, JButton Circ){

        this.length = len;
        this.B = Box;
        this.C = Circ;

        setBackground(Color.white);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switch (mode){
                    case 0:
                        CompositeMyShape.shapes.add(new Circle(e.getX(), e.getY(),length));
                        break;
                    case 1:
                        CompositeMyShape.shapes.add(new Box(e.getX(), e.getY(), length));
                        break;
                }
                repaint();
            }
        });

        this.B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mode = 1;
            }
        });

        this.C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mode =0;
            }
        });
    }

    public void paintComponent(Graphics g) {
        shapeCollection.paintComponent(g);
    }
}
