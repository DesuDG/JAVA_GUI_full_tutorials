import javax.swing.*;
import java.awt.*;
public class menu {
JMenu menu1,submenu,help;
JMenuItem i1,i2,i3,i4,i5;
menu(){
    JFrame f =new JFrame("DG Tech");
    JMenuBar mb=new JMenuBar();
    mb.setBackground(Color.darkGray);

    menu1=new JMenu("Tutorials");
    menu1.setForeground(Color.white);

    submenu=new JMenu("WEB_Dev");

    help=new JMenu("Help");
    help.setForeground(Color.white);

    mb.add(menu1); mb.add(help);

    i1=new JMenuItem("Java");
    i2=new JMenuItem("Python");
    i3=new JMenuItem("HTML");
    i4=new JMenuItem("CSS");
    i5=new JMenuItem("PHP");

    menu1.add(i1); menu1.add(i2);
    submenu.add(i3);
    submenu.add(i4);
    submenu.add(i5);
    menu1.add(submenu);

    f.setJMenuBar(mb);
    f.setSize(400,250);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(null);
    Container c=f.getContentPane();
    c.setBackground(Color.ORANGE);
    f.setVisible(true);
}

    public static void main(String[] args) {
        new menu();
    }

}
