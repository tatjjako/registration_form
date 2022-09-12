import javax.swing.*;

public class Fields {

    //frame and panel
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    //text labels
    JLabel username = new JLabel("Username");
    JLabel email = new JLabel("Email");
    JLabel phone = new JLabel("Phone");
    JLabel country = new JLabel("Country");
    JLabel city = new JLabel("City");
    JLabel street = new JLabel("Street");
    JLabel gender = new JLabel("Gender");
    JLabel password = new JLabel("Password");
    JLabel display = new JLabel();

    //input fields
    JTextField usernameText = new JTextField();
    JTextField emailText = new JTextField();
    JTextField phoneText = new JTextField();
    JTextField countryText = new JTextField();
    JTextField cityText = new JTextField();
    JTextField streetText = new JTextField();
    JPasswordField passwordText = new JPasswordField();

    //dropdown menu to choose gender
    String [] genderSelect = {"Male", "Female"};
    JComboBox genderText = new JComboBox<>(genderSelect);

    //submit button
    JButton submit = new JButton("Submit");
}
