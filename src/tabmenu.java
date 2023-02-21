import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tabmenu extends JFrame {
    public tabmenu() {
        JTabbedPane tp =new JTabbedPane();

        JPanel p1=new JPanel();
        p1.setBackground(Color.ORANGE);
        JLabel l1=new JLabel("This is Java Home");
        p1.add(l1,BorderLayout.CENTER);

        JPanel p2=new JPanel();
        p2.setBackground(Color.darkGray);
        JLabel l2=new JLabel("This is Python Home");
        p2.add(l2,BorderLayout.CENTER);

      tp.addTab("Java",p1);
      tp.addTab("Python",p2);

      JMenuBar mb=new JMenuBar();
      JMenu fm=new JMenu("File");
      fm.setMnemonic(KeyEvent.VK_F);

      JMenuItem i1=new JMenuItem("Exit");
      i1.setAccelerator(KeyStroke.getKeyStroke("control X"));

      i1.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              System.exit(0);
          }
      });
      fm.add(i1);
      mb.add(fm);

      this.add(tp);;
      this.setJMenuBar(mb);;

        // set the frame properties
        this.setTitle("DG Tech");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {

        new tabmenu();
    }
}
