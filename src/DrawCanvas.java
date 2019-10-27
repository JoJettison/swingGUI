import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawCanvas extends JPanel  {
    MyShape shapeCollection;
    private JButton B;
    private JButton C;
    private JButton T;
    private JButton U;
    private JButton R;
    //Controller Pattern
    private CanvasController controller;

    public DrawCanvas(JButton Box, JButton Circ, JButton Text, JButton Undo, JButton Redo) {
        this.B = Box;
        this.C = Circ;
        this.T = Text;
        this.U = Undo;
        this.R = Redo;

        setBackground(Color.white);

        controller = new CanvasController();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                controller.canvasClicked((int) e.getPoint().getX(), (int) e.getPoint().getY());
                shapeCollection = controller.getShapes();
                repaint();
            }
        });

        this.B.addActionListener(actionEvent -> controller.boxClicked());

        this.C.addActionListener(actionEvent -> controller.cirClicked());

        this.T.addActionListener(actionEvent -> controller.txtClicked());

        this.U.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                controller.undoClicked();
                repaint();
            }
        });

        this.R.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                controller.redoClicked();
                repaint();
            }
        });


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(shapeCollection!=null) shapeCollection.draw(g);
    }
}
