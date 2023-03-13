
import java.awt.*;
import javax.swing.*;

public class border
{


    // main method
    public static void main(String argvs[])
    {
        JFrame f = new JFrame();
        JPanel p=new JPanel(new BorderLayout(10,10));

        JButton b1=new JButton("NORTH");
        JButton b2=new JButton("SOUTH");
        JButton b3=new JButton("EAST");
        JButton b4=new JButton("WEST");
        JButton b5=new JButton("CENTER");

        p.add(b1,BorderLayout.NORTH);
        p.add(b2,BorderLayout.SOUTH);
        p.add(b3,BorderLayout.EAST);
        p.add(b4,BorderLayout.WEST);
        p.add(b5,BorderLayout.CENTER);

        f.add(p);

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
