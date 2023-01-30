import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Button {
    public static void main(String[] args) {
        JFrame frame= new JFrame("DG Tech");
        JLabel l1;

        l1=new JLabel("የቴክኖሎጅ ት/ትና መረጃ ቻናል!");
        l1.setFont(new Font("Ethiopia Jiret",Font.BOLD,28));
        l1.setBounds(100,20,400,30);
        l1.setForeground(Color.BLACK);
        JButton btn =new JButton("Click Me");
        btn.setBounds(200,100,100,40);
        btn.setFont(new Font("serif",Font.BOLD,24));
        btn.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        btn.setForeground(Color.black);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               l1.setText("Welcome to DG Tube!");
               l1.setForeground(Color.blue);

            }
        });





        frame.add(l1);
        frame.add(btn);
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
