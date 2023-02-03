import  java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class JcheckBox{
    public static void main(String[] args) {
        JFrame f= new JFrame("DG Tech");
        JLabel l1;

        l1=new JLabel("");
        l1.setFont(new Font("Serif",Font.BOLD,18));
        l1.setBounds(40,20,400,30);

        JCheckBox cb1,cb2;

        cb1 = new JCheckBox("Java");
        cb1.setBounds(100,50, 100,20);

        cb2 = new JCheckBox("Python");
        cb2.setBounds(100,75, 100,20);

        cb1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l1.setText("Java: "
                        + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        cb2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l1.setText("Python: "
                        + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });





        f.add(l1);
        f.add(cb1);
        f.add(cb2);

        ImageIcon icon=new ImageIcon("dgtech.png");
        f.setIconImage(icon.getImage());
        f.setTitle("DG Tech");
        f.setBounds(500,200,300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);


    }
}
