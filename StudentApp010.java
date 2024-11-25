import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class StudentApp010 extends JFrame implements ActionListener {
    JTextField rollNoField, nameField;
    JRadioButton maleRadio, femaleRadio;
    JComboBox<String> departmentBox;
    JTextArea textArea;
    JButton submitButton, viewButton;
    ButtonGroup genderGroup; // Declare genderGroup as an instance variable

    public StudentApp010() {
        setTitle("Student App");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Components for input
        add(new JLabel("Student Roll No.:"));
        rollNoField = new JTextField(20);
        add(rollNoField);

        add(new JLabel("Student Name:"));
        nameField = new JTextField(20);
        add(nameField);

        add(new JLabel("Gender:"));
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        genderGroup = new ButtonGroup(); // Initialize genderGroup
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        add(maleRadio);
        add(femaleRadio);

        add(new JLabel("Department:"));
        String[] departments = {"CE", "IT", "ME", "EC","CSE","AIML"};
        departmentBox = new JComboBox<>(departments);
        add(departmentBox);

        // Buttons
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        viewButton = new JButton("View");
        viewButton.addActionListener(this);
        add(viewButton);

        // Text area for displaying student details
        textArea = new JTextArea(10, 40);
        textArea.setEditable(false);
        add(new JScrollPane(textArea));

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("studentInfo.txt", true))) {
                String rollNo = rollNoField.getText();
                String name = nameField.getText();
                String gender = maleRadio.isSelected() ? "Male" : "Female";
                String department = departmentBox.getSelectedItem().toString();

                writer.write(rollNo + "," + name + "," + gender + "," + department);
                writer.newLine();

                JOptionPane.showMessageDialog(this, "Student information saved successfully!");
                rollNoField.setText("");
                nameField.setText("");
                genderGroup.clearSelection(); // Clears the selection of radio buttons
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving student information.");
            }
        } else if (e.getSource() == viewButton) {
            try (BufferedReader reader = new BufferedReader(new FileReader("studentInfo.txt"))) {
                textArea.setText("");
                String line;
                while ((line = reader.readLine()) != null) {
                    textArea.append(line + "\n");
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error reading student information.");
            }
        }
    }

    public static void main(String[] args) {
        new StudentApp010();
    }
}
