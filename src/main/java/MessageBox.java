import javax.swing.*;

public class MessageBox implements Dialog {

    public MessageBox() {

    }

    public int show(String message, String title) {

        JOptionPane.showMessageDialog(null, message, title, 1);

        return 0;
    }
}
