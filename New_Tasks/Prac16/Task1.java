import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task1 {
    Task1() {
        JFrame f = new JFrame();
        JButton b = new JButton("Try");
        JLabel label = new JLabel("Tries amount: 3");
        JLabel label2 = new JLabel("Less / More");
        TextField tf = new TextField(10);

        b.setBounds(100, 100, 75, 50);
        label.setBounds(500, 100, 100, 50);
        label2.setBounds(500, 200, 100, 50);
        tf.setBounds(100, 300, 100, 50);

        f.add(b);
        f.add(label);
        f.add(tf);
        f.add(label2);
        f.setLayout(null);
        f.setSize(1000, 1000);
        f.setVisible(true);

        int num = (int) (Math.random() * 20);
        System.out.println(num);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String text = label.getText();
                int tries_amount = Character.getNumericValue(text.charAt(text.length() - 1));

                int answer = Integer.parseInt(tf.getText());
                if (answer == num) {
                    JOptionPane.showMessageDialog(null, "YOU WON!");
                    System.exit(0);
                }

                tries_amount -= 1;

                if (tries_amount == 0 && answer != num) {
                    JOptionPane.showMessageDialog(null, "YOU LOSE!");
                    System.exit(1);
                } else {
                    label.setText("Tries amount: " + tries_amount);
                    System.out.println(num + " " + answer);
                    if (num > answer) {
                        label2.setText("More");
                    }
                    if (num < answer) {
                        label2.setText("Less");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        new Task1();
    }
}
