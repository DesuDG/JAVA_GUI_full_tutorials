import  java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class RadioButton{
    public static void main(String[] args) {
        JFrame f;
        f= new JFrame("DG Tech");

        JLabel l1;

        l1=new JLabel("Gender:");
        l1.setFont(new Font("Serif",Font.BOLD,18));
        l1.setBounds(40,20,400,30);

        JRadioButton rb1,rb2;

        rb1 = new JRadioButton("Male");
        rb1.setBounds(100,50, 100,20);

        rb2 = new JRadioButton("Female");
        rb2.setBounds(100,75, 100,20);

        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);bg.add(rb2);

        rb1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

                if(rb1.isSelected()){

                   JOptionPane.showMessageDialog(f,"You are Male!");
                }
            }
        });
        rb2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

                if(rb2.isSelected()){

                    JOptionPane.showMessageDialog(f,"You are Female!");
                }
            }
        });





        f.add(l1);
        f.add(rb1);
        f.add(rb2);

        ImageIcon icon=new ImageIcon("dgtech.png");
        f.setIconImage(icon.getImage());
        f.setTitle("DG Tech");
        f.setBounds(500,200,300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);


    }
}
