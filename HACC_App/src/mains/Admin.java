package mains;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;


public class Admin extends Login {
    Admin(){};   //Def cons

    @Override
    void authenticator(){
        JLabel errorMsg = new JLabel();
        errorMsg.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        errorMsg.setBounds(100, 190, 250, 20);
        loginPanel.add(errorMsg);

        final String username, password;
        username = field1.getText().toString();
        password = field2.getText().toString();

        // Stored Password & username
        final ArrayList<String> registeredUsernames = new ArrayList<String>();
        registeredUsernames.add("Abir");
        registeredUsernames.add("admin");
        final ArrayList<String> registeredPasswords = new ArrayList<String>();
        registeredPasswords.add("1111");
        registeredPasswords.add("admin");

        for (int i = 0; i < registeredUsernames.toArray().length; i++) {
            if (username.equals(registeredUsernames.get(i)) && password.equals(registeredPasswords.get(i))) {
                welcomeMsg();
                Home.frame.getContentPane().removeAll();
                Home.frame.repaint();
                new About(); // creating the control center
                Home.frame.validate();
                break;
            } else if (!(username.equals(registeredUsernames.get(i)) && password.equals(registeredPasswords.get(i)))) {
                if (username.equals(registeredUsernames.get(i)) && !password.equals(registeredPasswords.get(i))) {
                    JOptionPane.showMessageDialog(Home.frame, "Wrong Password ! Please recheck your Password");
                } else if (!username.equals(registeredUsernames.get(i))
                        && password.equals(registeredPasswords.get(i))) {
                    JOptionPane.showMessageDialog(Home.frame, "Wrong Username ! Please recheck your Username");
                } else if (!(username.equals(registeredUsernames.get(i)))
                        && !(password.equals(registeredPasswords.get(i)))) {
                    if (username.length() == 0 || password.length() == 0) {
                        if (username.length() == 0 && password.length() == 0) {
                            errorMsg.setText("Both Fields cannot be empty");
                            errorMsg.setForeground(java.awt.Color.RED);
                            errorMsg.setToolTipText("Fields should be filled with correct infos");
                            loginPanel.repaint();

                            int delay = 4000; // milliseconds
                            ActionListener taskPerformer = new ActionListener() {
                                @Override
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    errorMsg.setVisible(false);
                                }
                            };
                            new javax.swing.Timer(delay, taskPerformer).start();
                        } else {
                            errorMsg.setText("Any of the Fields cannot be empty");
                            errorMsg.setForeground(java.awt.Color.RED);
                            errorMsg.setToolTipText("Fields should be filled with correct infos");
                            loginPanel.repaint();

                            int delay = 4000; // milliseconds
                            ActionListener taskPerformer = new ActionListener() {
                                @Override
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    errorMsg.setVisible(false);
                                }
                            };
                            new javax.swing.Timer(delay, taskPerformer).start();
                        }
                    } else {
                        errorMsg.setText("Invalid Authentication ! Try Again");
                        errorMsg.setForeground(java.awt.Color.RED);
                        errorMsg.setToolTipText(
                                "This is an error message. Please input correct username and password to login");
                        loginPanel.repaint();

                        int delay = 4000; // milliseconds
                        ActionListener taskPerformer = new ActionListener() {
                            @Override
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                errorMsg.setVisible(false);
                            }
                        };
                        new javax.swing.Timer(delay, taskPerformer).start();
                    }
                }
            }
        }
    }
}
