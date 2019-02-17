import javax.swing.*;

public class MessageBox implements Dialog {

    public MessageBox() {

    }

    public int show(String message, String title) {

        JOptionPane.showMessageDialog(null, message, title, 1);

        return 0;
        // return JOptionPane.OK_OPTION
        // Per converstaion with you Josh, I'm choosing to returning 0 rather than the JOptionPane.OK_Option. Either seems to work though
    }
}
