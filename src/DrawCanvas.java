import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DrawCanvas extends JPanel  {
    private List<MyShape> shapes;
    private double length;
    private int mode;
    private JButton B;
    private JButton C;
    //Controller Pattern
    public DrawCanvas(double len, JButton Box, JButton Circ){
        this.shapes = new ArrayList<MyShape>();
        this.length = len;
        this.B = Box;
        this.C = Circ;

        setBackground(Color.white);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switch (mode){
                    case 0:
                        shapes.add(new Circle(e.getX(), e.getY(),length));
                        break;
                    case 1:
                        shapes.add(new Box(e.getX(), e.getY(), length));
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

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.black);
        //Iterator Pattern
        Iterator shapeIterator = this.shapes.iterator();

        while (shapeIterator.hasNext()) {
            MyShape sh = (MyShape) shapeIterator.next();
            sh.paintComponent(g);
        }
    }
}
