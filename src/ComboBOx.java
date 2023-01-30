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

//
//        JLabel l2 = new JLabel();
//        l2.setBounds(175,50,400,100);
          JButton btn=new JButton("Select");
          btn.setBounds(200,150,75,20);

        String languages[]={"Python","Java","HTML","JavaScript","PHP"};
        JComboBox cb=new JComboBox(languages);
        cb.setBounds(50, 100,90,20);

        JTextField tf= new JTextField();
        tf.setBounds(200,100,100,20);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String st=cb.getSelectedItem().toString();
                tf.setText(st);
            }
        });

        f.add(cb);
        f.add(l1);
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