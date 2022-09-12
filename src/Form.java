import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends Fields{

    //form preparation
    public void registerForm() {

        //define frame and add panel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(200, 100, 600, 500);
        frame.setTitle("Registration form");
        frame.add(panel);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);

        //Add elements to panel
        panel.add(username);
        panel.add(usernameText);
        username.setBounds(20, 20, 80, 30);
        usernameText.setBounds(110, 20, 160, 30);

        panel.add(email);
        panel.add(emailText);
        email.setBounds(20, 60, 80, 30);
        emailText.setBounds(110, 60, 160, 30);

        panel.add(phone);
        panel.add(phoneText);
        phone.setBounds(20, 100, 80, 30);
        phoneText.setBounds(110, 100, 160, 30);

        panel.add(country);
        panel.add(countryText);
        country.setBounds(20, 140, 80, 30);
        countryText.setBounds(110, 140, 160, 30);

        panel.add(city);
        panel.add(cityText);
        city.setBounds(20, 180, 80, 30);
        cityText.setBounds(110, 180, 160, 30);

        panel.add(street);
        panel.add(streetText);
        street.setBounds(20, 220, 80, 30);
        streetText.setBounds(110, 220, 160, 30);

        panel.add(gender);
        panel.add(genderText);
        gender.setBounds(20, 260, 80, 30);
        genderText.setBounds(110, 260, 160, 30);

        panel.add(password);
        panel.add(passwordText);
        password.setBounds(20, 300, 80, 30);
        passwordText.setBounds(110, 300, 160, 30);

        panel.add(submit);
        submit.setBounds(170, 350, 100, 40);
        submit.setFocusable(false);
        submit.setBackground(Color.GREEN);

        //"submit" button onclick action: inputted info should be displayed below the button
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.add(display);
                display.setBounds(20, 350, 500,150);
                display.setText(usernameText.getText() + ", " + emailText.getText() + ", " +
                        phoneText.getText() + ", " + countryText.getText() + ", " + cityText.getText() + ", " +
                        streetText.getText() + ", " + genderText.getSelectedItem() + ", " + passwordText.getText());

            }
        });

    }

}
