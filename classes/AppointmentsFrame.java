package Project.classes;

import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PrivilegedAction;

public class AppointmentsFrame extends JFrame implements ActionListener {
    private  String ICON_PATH="C:\\Users\\AHTISHAM\\Desktop\\My_Workspace\\java_workspace\\Project\\icons\\appointmentbg.jpg";

    AppointmentsFrame(){
        this.setTitle("Billing");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        this.setSize(width - 20, height - 20);
        setIconImage(new ImageIcon(ICON_PATH ).getImage());
        this.setResizable(true);

        // Creating the background panel with an image
        WelcomeBackgroundPanel BillingPanel = new WelcomeBackgroundPanel(new ImageIcon(ICON_PATH).getImage());
        BillingPanel.setLayout(null);



        this.add(BillingPanel);
        this.setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new AppointmentsFrame();
    }
}
