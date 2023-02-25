import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sayStuff {
    private JPanel panel1;
    private JButton yesButton;

    public sayStuff() {
        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp);
                ((Window) win).dispose();

                new iSaidYes();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("sayStuff");
        frame.setContentPane(new sayStuff().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}
