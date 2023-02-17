import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class slider {
    public static void main(String[] args) {

        JFrame f;
        f= new JFrame("DG Tech");
        JSlider sl;
        sl= new JSlider(SwingConstants.HORIZONTAL,0,100,50);
        sl.setBounds(20,25,300,50);
        sl.setMajorTickSpacing(10);
        sl.setMinorTickSpacing(5);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);
        sl.setForeground(Color.blue);
        JTextField tf =new JTextField();
        tf.setBounds(100,100,100,30);
        sl.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                String value=String.valueOf(sl.getValue());
                tf.setText(value);
            }
        });



        f.add(sl);
        f.add(tf);


        ImageIcon icon=new ImageIcon("dgtech.png");
        f.setIconImage(icon.getImage());
        f.setTitle("DG Tech");
        f.setBounds(500,200,350,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
        Container c=f.getContentPane();
        c.setBackground(Color.ORANGE);
    }
}
