package res.mains;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
// import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
    JPanel loginPanel = new JPanel();
    JButton submit = new JButton();
    JLabel label1, label2, label3;
    JTextField field1, field2;
    JButton back = new JButton();

    Login() {
        Home.frame.add(loginPanel); // Adding the panel to the frame

        loginPanel.setLayout(null);
        loginPanel.setSize(1100, 600);
        loginPanel.setVisible(true);

        // Username:
        usernameConfig();

        // Password:
        label2 = new JLabel("Password");
        field2 = new JPasswordField(15);
        label2.setBounds(10, 260, 200, 40);
        field2.setBounds(10, 300, 250, 30);

        // Submit button:
        submit.setText("Submit");
        submit.setBounds(10, 350, 120, 40);
        Home.designer.BtnFontDesigner(submit);

        // Back Button
        back.setText("Home");
        back.setBounds(140, 350, 120, 40);
        Home.designer.BtnFontDesigner(back);

        //Header 
        headerConfig();

        // Adding components:
        loginPanel.add(label1);
        loginPanel.add(field1);
        loginPanel.add(label2);
        loginPanel.add(field2);
        loginPanel.add(submit);
        loginPanel.add(back);
        loginPanel.add(label3);

        submitHover();
        backHover();
        // submitAction();
        submitEnterPressAction();

    }

    protected void usernameConfig() {
        label1 = new JLabel("Username");
        field1 = new JTextField(15);
        label1.setBounds(10, 180, 200, 40);
        field1.setBounds(10, 220, 250, 30);
    }

    void headerConfig() {
        label3 = new JLabel("HACC User Login");
        label3.setBounds(50, 5, 250, 30);
        label3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        label3.setForeground(Color.BLUE);
    }

    void welcomeMsg() {
        JOptionPane.showMessageDialog(loginPanel, "You have successfully logged in", "Login Confirmation",
                JOptionPane.INFORMATION_MESSAGE);
    }

    void notAllowedMsg() {
        JOptionPane.showMessageDialog(loginPanel, "Incorrect login or password. Try again", "Error",
                JOptionPane.ERROR_MESSAGE);
    }

    void submitHover() {
        submit.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                authenticator();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                submit.setForeground(Color.RED);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                submit.setForeground(Color.BLACK);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                submit.setBackground(Color.GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Home.designer.defBtnColor(submit);

            }

        });
    }

    void authenticator() {
        JLabel errorMsg = new JLabel();
        errorMsg.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        errorMsg.setBounds(100, 190, 250, 20);
        loginPanel.add(errorMsg);

        final String username, password;
        username = field1.getText().toString();
        password = field2.getText().toString();

        /* // Stored Password & username
        final ArrayList<String> registeredUsernames = new ArrayList<String>();
        registeredUsernames.add("Abir");
        registeredUsernames.add("Nazmul");
        registeredUsernames.add("Test");
        final ArrayList<String> registeredPasswords = new ArrayList<String>();
        registeredPasswords.add("1234");
        registeredPasswords.add("12345");
        registeredPasswords.add("0000"); */


        for (int i = 0; i < Database.registeredUsernames.length; i++) {
            if (username.equals(Database.registeredUsernames[i]) && password.equals(Database.registeredPasswords[i])) {
                welcomeMsg();
                Home.frame.getContentPane().removeAll();
                Home.frame.repaint();
                //Console log:
                System.out.println("Authentication Successful\n\n");
                new ContCent(); // creating the control center
                Home.frame.validate();
                break;
            } else if (!(username.equals(Database.registeredUsernames[i]) && password.equals(Database.registeredPasswords[i]))) {
                if (username.equals(Database.registeredUsernames[i]) && !password.equals(Database.registeredPasswords[i])) {
                    JOptionPane.showMessageDialog(Home.frame, "Wrong Password ! Please recheck your Password");
                } else if (!username.equals(Database.registeredUsernames[i])
                        && password.equals(Database.registeredPasswords[i])) {
                    JOptionPane.showMessageDialog(Home.frame, "Wrong Username ! Please recheck your Username");
                } else if (!(username.equals(Database.registeredUsernames[i]))
                        && !(password.equals(Database.registeredPasswords[i]))) {
                    if (username.length() == 0 || password.length() == 0) {
                        if (username.length() == 0 && password.length() == 0) {
                            errorMsg.setText("Both Fields cannot be empty");
                            errorMsg.setForeground(Color.RED);
                            errorMsg.setToolTipText("Fields should be filled with correct infos");
                            loginPanel.repaint();

                            int delay = 4000; // milliseconds
                            ActionListener taskPerformer = new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent evt) {
                                    errorMsg.setVisible(false);
                                }
                            };
                            new javax.swing.Timer(delay, taskPerformer).start();
                        } else {
                            errorMsg.setText("Any of the Fields cannot be empty");
                            errorMsg.setForeground(Color.RED);
                            errorMsg.setToolTipText("Fields should be filled with correct infos");
                            loginPanel.repaint();

                            int delay = 4000; // milliseconds
                            ActionListener taskPerformer = new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent evt) {
                                    errorMsg.setVisible(false);
                                }
                            };
                            new javax.swing.Timer(delay, taskPerformer).start();
                        }
                    } else {
                        errorMsg.setText("Invalid Authentication ! Try Again");
                        errorMsg.setForeground(Color.RED);
                        errorMsg.setToolTipText(
                                "This is an error message. Please input correct username and password to login");
                        loginPanel.repaint();

                        int delay = 4000; // milliseconds
                        ActionListener taskPerformer = new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent evt) {
                                errorMsg.setVisible(false);
                            }
                        };
                        new javax.swing.Timer(delay, taskPerformer).start();
                    }
                }
            }
            // else{
            // JOptionPane.showConfirmDialog(Home.frame, "Fatal Error ! Something went
            // wrong", "Unknown Error", JOptionPane.ERROR_MESSAGE);
            // }
        }
        // if (username.equals(registeredUsernames.get(0)) &&
        // password.equals(registeredPasswords.get(0))) {
        // welcomeMsg();
        // }
        // else
        // {
        // notAllowedMsg();
        // }
    }

    void backHover() {
        back.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {
                loginPanel.setVisible(false);
                new Home();
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                back.setBackground(Color.GRAY);

            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                Home.designer.defBtnColor(back);

            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                back.setForeground(Color.RED);

            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                back.setForeground(Color.BLACK);

            }

        });
    }

    void submitEnterPressAction() {
        loginPanel.getRootPane().setDefaultButton(submit);
        submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                authenticator();
            }

        });
    }

}