package Project.classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Project.classes.LoginFrame.ICON_PATH;

public class InventoryFrame extends JFrame implements ActionListener {
private String ICON_PATH = "C:\\Users\\AHTISHAM\\Desktop\\My_Workspace\\java_workspace\\Project\\icons\\inventorybg.png";
    InventoryFrame(){
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        this.setSize(width - 20, height - 20);
        this.setTitle("Welcome To HMS");
        setIconImage(new ImageIcon(ICON_PATH + "inventorybg.png").getImage());
        this.setResizable(true);

        // Creating the background panel with an image
        WelcomeBackgroundPanel InventoryPanel = new WelcomeBackgroundPanel(new ImageIcon(ICON_PATH).getImage());
        InventoryPanel.setLayout(null);



this.add(InventoryPanel);
this.setVisible(true);
    }





    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new InventoryFrame();
    }

}
