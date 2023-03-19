import javax.swing.*;
import java.awt.*;

public class login extends JPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login Form");

        // Create components
       JLabel un=new JLabel("Username:");
       JLabel pass=new JLabel("Password:");

       JTextField unf=new JTextField(10);
       JPasswordField passf=new JPasswordField(10);

       JButton btn=new JButton("Login");

        // Set layout manager
        f.setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.insets=new Insets(5,5,5,5);


        // Add username label
        gbc.gridx=0;
        gbc.gridy=0;
        f.add(un,gbc);

        // Add username field
        gbc.gridx=1;
        f.add(unf,gbc);

        // Add password label
        gbc.gridx=0;
        gbc.gridy=1;
        f.add(pass, gbc);

        // Add password field
        gbc.gridx=1;
        f.add(passf, gbc);

        // Add login button
        gbc.gridx=1;
        gbc.gridy=2;
        f.add(btn, gbc);

        f.setBounds(500,200,300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
        Container c=f.getContentPane();
        c.setBackground(Color.ORANGE);



    }

}
