import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UserDetailApp extends JFrame {
    private JTextField nameField;
    private JTextField ageField;
    private JTextArea displayArea;
    private ArrayList<String> userDetails;

    public UserDetailApp() {
        // Initialize the ArrayList to store user details
        userDetails = new ArrayList<>();

        // Set up the JFrame
        setTitle("User Details Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create input fields for user details
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Age:"));
        ageField = new JTextField();
        inputPanel.add(ageField);

        JButton addButton = new JButton("Add User");
        inputPanel.add(addButton);

        // Add the input panel to the JFrame
        add(inputPanel, BorderLayout.NORTH);

        // Create a display area to show the stored user details
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        add(scrollPane, BorderLayout.CENTER);

        // Add functionality to the "Add User" button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();

                if (!name.isEmpty() && !age.isEmpty()) {
                    // Store user details in the ArrayList
                    userDetails.add("Name: " + name + ", Age: " + age);

                    // Update the display area
                    displayArea.setText("");
                    for (String detail : userDetails) {
                        displayArea.append(detail + "\n");
                    }

                    // Clear the input fields
                    nameField.setText("");
                    ageField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Please fill out all fields.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserDetailApp().setVisible(true);
            }
        });
    }
}
