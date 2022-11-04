import java.awt.*;

import javax.swing.*;

public class Task3 {
    public static void main(String args[]) {
        JFrame frame = new JFrame("gl_epka GUI");

        System.out.println(args[0]);
        ImageIcon image = new ImageIcon(args[0]);

        JPanel panel = new JPanel();

        JLabel label = new JLabel(image);

        panel.add(label);

        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
