import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainWin {

    public static void main(String[] args) {

        //Declare GUI Items
        JFrame mainFrame = new JFrame("HW1 GUI");
        JButton boxButton = new JButton("Box");
        JButton circleButton = new JButton("Circle");
        JButton textButton = new JButton("Hello World!");
        JButton undoButton = new JButton("Undo");
        JButton redoButton = new JButton("Redo");
        Border buttonBorder = BorderFactory .createLineBorder(Color.black,2,true);
        JPanel sidePanel = new JPanel();
        DrawCanvas canvasCtrl = new DrawCanvas(boxButton,circleButton,textButton,undoButton,redoButton);

        //Modify & assemble GUI Items
        circleButton.setBorder(buttonBorder);
        circleButton.setPreferredSize(new Dimension(100,30));
        boxButton.setBorder(buttonBorder);
        boxButton.setPreferredSize(new Dimension(100,30));
        textButton.setBorder(buttonBorder);
        textButton.setPreferredSize(new Dimension(100,30));
        undoButton.setBorder(buttonBorder);
        undoButton.setPreferredSize(new Dimension( 100,40));
        redoButton.setBorder(buttonBorder);
        redoButton.setPreferredSize(new Dimension(100,40));


        sidePanel.setBackground(Color.darkGray);
        sidePanel.setBounds(0,0,100,500);
        sidePanel.add(circleButton);
        sidePanel.add(boxButton);
        sidePanel.add(textButton);
        sidePanel.add(undoButton);
        sidePanel.add(redoButton);
        canvasCtrl.setBounds(100,0,400,500);

        mainFrame.add(sidePanel,BorderLayout.WEST);
        mainFrame.add(canvasCtrl);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500,500);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);


    }
}
