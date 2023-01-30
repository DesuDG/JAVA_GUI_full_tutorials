import javax.swing.*;
import java.awt.*;
public class JLabel_and_JTextfield {
    public static void main(String args[])
    {
        JFrame frame= new JFrame();
        JLabel l1,l2,l3;

        l1=new JLabel("የቴክኖሎጅ ት/ትና መረጃ ቻናል!");
        l1.setFont(new Font("Ethiopia Jiret",Font.BOLD,28));
        l1.setBounds(100,20,400,30);
        l1.setForeground(Color.BLACK);

        l2=new JLabel("UserName:");
        l2.setFont(new Font("Ethiopia Jiret",Font.BOLD,28));
        l2.setBounds(50,60,175,30);
        l2.setForeground(Color.BLACK);

        l3=new JLabel("Password:");
        l3.setFont(new Font("Ethiopia Jiret",Font.BOLD,28));
        l3.setBounds(50,100,175,30);
        l3.setForeground(Color.BLACK);

        //JTextField
        JTextField t1= new JTextField();
        t1.setBounds(250,60,150,25);

        JTextField t2= new JTextField();
        t2.setBounds(250,100,150,25);





        frame.add(l1);
        frame.add(l2);
        frame.add(l3);

        frame.add(t1);
        frame.add(t2);




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
