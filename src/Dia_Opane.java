import javax.swing.*;


public class Dia_Opane {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JOptionPane.showMessageDialog(f,"Wellcome to My Channel!");
        JOptionPane.showMessageDialog(f,"Security alert!","Alert",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(f,"Something went wrong","Error",JOptionPane.ERROR_MESSAGE);
        String name=JOptionPane.showInputDialog(f,"Enter Name");
        int d=JOptionPane.showConfirmDialog(f,"are you sure?");
        if(d==JOptionPane.YES_OPTION){
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    }
