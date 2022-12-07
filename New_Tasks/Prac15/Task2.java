import javax.swing.*;
import java.awt.event.*;

public class Task2 {
    Task2() {
        JFrame f = new JFrame("Task2");
        String country[] = { "Australia", "China", "England", "Russia" };
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50, 50, 90, 20);

        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);

        JButton b = new JButton("Click");
        b.setBounds(200, 100, 75, 20);

        f.add(cb);
        f.add(label);
        f.add(b);

        f.setLayout(null);
        f.setSize(400, 500);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Press button";

                switch (cb.getSelectedIndex()) {
                    case 0:
                        data = "Kengouru";
                        break;
                    case 1:
                        data = "Dragon";
                        break;
                    case 2:
                        data = "Korgy";
                        break;
                    case 3:
                        data = "Bear";
                        break;
                }
                label.setText(data);
            }
        });

    }

    public static void main(String[] args) {
        new Task2();
    }
}
