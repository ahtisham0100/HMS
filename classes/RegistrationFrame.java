package Project.classes;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RegistrationFrame extends JFrame {
    private static final String ICON_PATH = "C:\\Users\\AHTISHAM\\Desktop\\My_Workspace\\java_workspace\\Project\\icons\\hospital.png";
    private static final String BG_PATH = "C:\\Users\\AHTISHAM\\Desktop\\My_Workspace\\java_workspace\\Project\\icons\\regbbg.png";

    JTextField ageField, nameField, lastNameField, dateField;
    JLabel ageLabel, nameLabel, dateLabel, docLabel, bedVar, regFormLabel, lastNameLabel;
    JButton registrationButton;
    JList<String> docList;
    Checkbox bedAllocation;

    public RegistrationFrame() {
        // Set frame properties
        setTitle("Patient Registration");
        setIconImage(new ImageIcon(ICON_PATH).getImage());
        setSize(800, 600);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Creating a background panel
        BackgroundPanel bgPanel = new BackgroundPanel(new ImageIcon(BG_PATH).getImage());
        bgPanel.setLayout(null);
        bgPanel.setBounds(0, 0, 800, 600);

        // Initializing components

        //fields
        ageField = new JTextField(" ", 20);
        nameField = new JTextField(" ", 20);
        lastNameField = new JTextField(" ", 20);
        dateField = new JTextField(20);

        //labels
        ageLabel = new JLabel("Age");
        nameLabel = new JLabel("First Name");
        lastNameLabel = new JLabel("Last Namw ");
        dateLabel = new JLabel("Appointment Date");
        docLabel = new JLabel("Doctor");
        bedVar = new JLabel("Bed Allocated");

        regFormLabel = new JLabel("Patient Registration Form");
        regFormLabel.setBackground(new Color(0x8956CB));
        regFormLabel.setOpaque(true);
        regFormLabel.setForeground(Color.white);
        ImageIcon icon = new ImageIcon("C:\\Users\\AHTISHAM\\Desktop\\My_Workspace\\java_workspace\\Project\\icons\\registartion.png");
        regFormLabel.setIcon(icon);
        registrationButton = new JButton("Confirm Registration");
        registrationButton.setBackground(new Color(61, 100, 110));
        registrationButton.setForeground(Color.WHITE);
        registrationButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        registrationButton.setFocusable(false);
        registrationButton.addActionListener(e -> registrationButtonActionPerformed());

        docList = new JList<>(new String[]{"Dr Arnav", "Dr Sara", "Dr Sayyam", "Dr Alex", "Dr Hina"});
        docList.setSize(150,20);
        bedAllocation = new Checkbox("Check if Yes");
        bedAllocation.setSize(100,20);

        // Adding components to panels
        JPanel formPanel = new JPanel();
        formPanel.setLayout(null);
        formPanel.setOpaque(false);
        formPanel.setBounds(50, 50, 700, 500);

        regFormLabel.setBounds(220, 20, 330, 30);
        regFormLabel.setFont(new Font("Monospace",1,24));
        formPanel.add(regFormLabel);

        nameLabel.setBounds(50, 70, 100, 30);
        nameField.setBounds(150, 70, 200, 30);
        formPanel.add(nameLabel);
        formPanel.add(nameField);

        lastNameLabel.setBounds(370, 70, 100, 30);
        lastNameField.setBounds(470, 70, 200, 30);
        formPanel.add(lastNameLabel);
        formPanel.add(lastNameField);

        ageLabel.setBounds(50, 120, 100, 30);
        ageField.setBounds(150, 120, 200, 30);
        formPanel.add(ageLabel);
        formPanel.add(ageField);

        dateLabel.setBounds(370, 120, 150, 30);
        dateField.setBounds(520, 120, 150, 30);
        formPanel.add(dateLabel);
        formPanel.add(dateField);

        docLabel.setBounds(50, 170, 100, 30);
        JScrollPane docScrollPane = new JScrollPane(docList);
        docScrollPane.setBounds(150, 170, 200, 50);
        formPanel.add(docLabel);
        formPanel.add(docScrollPane);

        bedVar.setBounds(370, 170, 100, 30);
        bedAllocation.setBounds(470, 170, 100, 30);
        formPanel.add(bedVar);
        formPanel.add(bedAllocation);

        registrationButton.setBounds(500, 300, 170, 40);
        formPanel.add(registrationButton);

        bgPanel.add(formPanel);

        // Adding background panel to frame
        add(bgPanel);
        setVisible(true);
    }

    private void registrationButtonActionPerformed() {
        //variables to store patient details and will be passed to store in date ;
        if (nameField.equals(" ") || lastNameField.equals(" ") || ageField.equals(" ") || docList.isSelectionEmpty() ) {
            JOptionPane.showMessageDialog(null, "Please enter all details of Patient", "Details required", JOptionPane.WARNING_MESSAGE);
        } else {
            String firstname =  nameField.getText();
            String lastname = lastNameField.getText();
            String name = firstname + " "+ lastname ;
            String age = ageField.getText();
            Boolean bed = bedAllocation.getState();
            String doctor = docList.getSelectedValue();
//when patient details are submitted A message box will pop up Showing details of Patient;
            String message = "Patient Name: " + name + "\nAge : " + age + "\nDoctor Reffered :" + doctor + "\nBed Allocated : " + bed;
            // TODO: Implement registration logic here
            // ArrayList<String> patientdetails = new ArrayList<>(List.of(new String[]{name, age}));
            JOptionPane.showMessageDialog(null, message, "Patient Details", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }
    public static void main(String[] args) {
        new RegistrationFrame();
    }
}

// Class for image background panel
