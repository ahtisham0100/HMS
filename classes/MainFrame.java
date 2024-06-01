package Project.classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginFrame extends JFrame implements ActionListener {
    public static final String ICON_PATH = "C:\\Users\\AHTISHAM\\Desktop\\My_Workspace\\java_workspace\\Project\\icons\\hospital.png";
    public static final String BG_PATH = "C:\\Users\\AHTISHAM\\Desktop\\My_Workspace\\java_workspace\\Project\\icons\\bg.png";
    JPasswordField passField;
    JTextField usernameTextField;
    JButton submitbutton;

    LoginFrame() {
        // Set frame properties
        this.setTitle("LOGIN Page");
        setIconImage(new ImageIcon(ICON_PATH).getImage());
        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Creating a background panel
        BackgroundPanel registrationbg = new BackgroundPanel(new ImageIcon(BG_PATH).getImage());
        registrationbg.setLayout(null);
        registrationbg.setBounds(0, 0, 500, 500);

        // Creating labels, text fields, and button
        JLabel logolabel = new JLabel("Enter your Credentials to Login.", new ImageIcon(ICON_PATH), JLabel.CENTER);
        logolabel.setVerticalTextPosition(JLabel.BOTTOM);
        logolabel.setHorizontalTextPosition(JLabel.CENTER);

        JLabel usernamelabel = new JLabel("UserName", new ImageIcon("C:\\Users\\AHTISHAM\\Desktop\\My_Workspace\\java_workspace\\Project\\icons\\user.png"), JLabel.RIGHT);
        usernamelabel.setForeground(new Color(1));
        usernamelabel.setFont(new Font("Calibri", Font.BOLD, 16));

        usernameTextField = new JTextField(20);

        JLabel passwordlabel = new JLabel("PassWord", new ImageIcon("C:\\Users\\AHTISHAM\\Desktop\\My_Workspace\\java_workspace\\Project\\icons\\password.png"), JLabel.RIGHT);
        passwordlabel.setForeground(new Color(1));
        passwordlabel.setFont(new Font("Calibri", Font.BOLD, 16));

        passField = new JPasswordField(20);

        submitbutton = new JButton("LogIn");
        submitbutton.setBackground(new Color(0x204B56));
        submitbutton.setForeground(Color.WHITE);
        submitbutton.setFont(new Font("Calibri", Font.BOLD, 16));
        submitbutton.addActionListener(this);

        // Creating and setting up panels
        JPanel logopanel = new JPanel();
        logopanel.setOpaque(false); // Make the panel transparent
        logopanel.setBounds(0, 0, 500, 150);
        logopanel.add(logolabel);

        JPanel userpanel = new JPanel();
        userpanel.setOpaque(false); // Make the panel transparent
        userpanel.setBounds(15, 150, 150, 50);
        userpanel.add(usernamelabel);

        JPanel usernamepanel = new JPanel();
        usernamepanel.setOpaque(false); // Make the panel transparent
        usernamepanel.setBounds(150, 150, 349, 50);
        usernamepanel.add(usernameTextField);

        JPanel passwordlabelpanel = new JPanel();
        passwordlabelpanel.setOpaque(false); // Make the panel transparent
        passwordlabelpanel.setBounds(15, 250, 150, 50);
        passwordlabelpanel.add(passwordlabel);

        JPanel passwordfieldpanel = new JPanel();
        passwordfieldpanel.setOpaque(false); // Make the panel transparent
        passwordfieldpanel.setBounds(150, 250, 349, 50);
        passwordfieldpanel.add(passField);

        JPanel buttonpanel = new JPanel();
        buttonpanel.setOpaque(false); // Make the panel transparent
        buttonpanel.setBounds(200, 320, 100, 50);
        buttonpanel.add(submitbutton);

        // Adding panels to the background panel
        registrationbg.add(logopanel);
        registrationbg.add(userpanel);
        registrationbg.add(usernamepanel);
        registrationbg.add(passwordlabelpanel);
        registrationbg.add(passwordfieldpanel);
        registrationbg.add(buttonpanel);

        // Adding the background panel to the frame
        add(registrationbg);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameTextField.getText();
        String password = new String(passField.getPassword());
        if (e.getSource() == submitbutton && username.equals("admin") && password.equals("admin123")) {
            new Welcome();   // welcome frame opens
            this.dispose();
        } else{
            JOptionPane.showMessageDialog(null,"INCORRENT USERNAME OR PASSWORD","ERROR",JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}

// Class for image background panel
class BackgroundPanel extends JPanel {
    private final Image backgroundImage;

    public BackgroundPanel(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
