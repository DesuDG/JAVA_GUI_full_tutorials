import  java.awt.*;
import javax.swing.*;
public class Frames {
    public static void main(String[] args) {

        JFrame frame= new JFrame("DG Tech");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500,300);
//        frame.setLocation(100,100);
        frame.setBounds(500,200,500,300);

//        frame.setTitle("DG Tech");

        ImageIcon icon = new ImageIcon("dgtech.png");
        frame.setIconImage(icon.getImage());

        Container c=frame.getContentPane();
        c.setBackground(Color.ORANGE);

    }
}
