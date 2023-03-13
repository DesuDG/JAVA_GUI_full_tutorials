
import java.awt.*;
import javax.swing.*;

public class flowlayout {

    public static void main(String argvs[])
    {
        JFrame f = new JFrame();
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setLayout(new FlowLayout());


        ImageIcon icon=new ImageIcon("dgtech.png");
        f.setIconImage(icon.getImage());
        f.setTitle("DG Tech");
        f.setBounds(500,200,300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
        Container c=f.getContentPane();
        c.setBackground(Color.ORANGE);




    }
}    