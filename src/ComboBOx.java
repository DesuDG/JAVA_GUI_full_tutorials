import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ComboBOx {
    public static void main(String[] args) {

        JFrame f= new JFrame();
        JLabel l1;

        l1=new JLabel("የቴክኖሎጅ ት/ትና መረጃ ቻናል!");
        l1.setFont(new Font("Ethiopia Jiret",Font.BOLD,28));
        l1.setBounds(100,20,400,30);
        l1.setForeground(Color.BLACK);

        String lang[] ={"Python","Java","Javascript","HTML","PHP","CSS"};
        JComboBox cb=new JComboBox(lang);
        cb.setBounds(50,100,90,20);

        JTextField tf =new JTextField();
        tf.setBounds(200,100,100,20);

        JButton btn =new JButton("Select");
        btn.setBounds(200,150,75,20);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String st=cb.getSelectedItem().toString();
                tf.setText(st);

            }
        });




        f.add(l1);
        f.add(cb);
        f.add(tf);
        f.add(btn);




        ImageIcon icon=new ImageIcon("dgtech.png");
        f.setIconImage(icon.getImage());
        f.setTitle("DG Tech");
        f.setBounds(500,200,500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
        Container c= f.getContentPane();
        c.setBackground(Color.ORANGE);

    }
}    