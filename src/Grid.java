import java.awt.*;
import javax.swing.*;

public class Grid
{
    // main method
    public static void main(String argvs[])
    {
        JFrame f = new JFrame();
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");
        JButton b6=new JButton("6");
        JButton b7=new JButton("7");
        JButton b8=new JButton("8");
        JButton b9=new JButton("9");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);

        f.setLayout(new GridLayout(3,3,5,5));


        ImageIcon icon=new ImageIcon("dgtech.png");
        f.setIconImage(icon.getImage());
        f.setTitle("DG Tech");
        f.setBounds(500,200,200,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
        Container c=f.getContentPane();
        c.setBackground(Color.ORANGE);




    }
} 