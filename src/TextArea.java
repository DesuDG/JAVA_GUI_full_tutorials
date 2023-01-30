import javax.swing.*;
import java.awt.*;

public class TextArea
{
    public static void main(String[] args) {
        JFrame frame= new JFrame();
//  Text Area:
//           is a multi-line text component to display text
//           or allow the user to enter text

        JTextArea ta =new JTextArea("Write here....");
        ta.setBounds(50,20,400,150);
        ta.setFont(new Font("Serif",Font.BOLD,22));
        ta.setBackground(Color.darkGray);
        ta.setForeground(Color.white);
        ta.setLineWrap(true);

        frame.add(ta);


        ImageIcon icon=new ImageIcon("dgtech.png");
        frame.setIconImage(icon.getImage());
        frame.setTitle("DG Tech");
        frame.setBounds(500,200,500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        Container c= frame.getContentPane();
        c.setBackground(Color.ORANGE);
    }

    }
