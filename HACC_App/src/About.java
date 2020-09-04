import javax.swing.JFrame;

public class About {
    JFrame aboutFrame = new JFrame();
    About(){
        // aboutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aboutFrame.setVisible(true);
        // aboutFrame.setSize(500, 300);
        aboutFrame.setAutoRequestFocus(true);
        aboutFrame.setBounds(400,200, 500, 300);
    }
}
