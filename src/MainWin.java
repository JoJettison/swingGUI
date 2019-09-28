import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainWin {

    public static void main(String[] args) {

        //Declare GUI Items
        JFrame mainFrame = new JFrame("HW1 GUI");
        JButton boxButton = new JButton("Box");
        JButton circleButton = new JButton("Circle");
        Border buttonBorder = BorderFactory .createLineBorder(Color.black,2,true);
        JPanel sidePanel = new JPanel();
        DrawCanvas canvasCtrl = new DrawCanvas(30,boxButton,circleButton);

        //Modify & assemble GUI Items
        circleButton.setBorder(buttonBorder);
        circleButton.setPreferredSize(new Dimension(100,30));
        boxButton.setBorder(buttonBorder);
        boxButton.setPreferredSize(new Dimension(100,30));

        sidePanel.setBackground(Color.darkGray);
        sidePanel.setBounds(0,0,100,500);
        sidePanel.add(circleButton);
        sidePanel.add(boxButton);
        canvasCtrl.setBounds(100,0,400,500);

        mainFrame.add(sidePanel,BorderLayout.WEST);
        mainFrame.add(canvasCtrl);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500,500);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);


    }
}
