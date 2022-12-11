import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task3 implements ActionListener {
    JTextArea ta;
    JMenuItem blue, red, black, font1, font2, font3;
    JFrame f;
    JMenuBar mb;
    JMenu fonts, colors;

    Font f1, f2, f3;

    Task3() {
        f = new JFrame();

        f1 = new Font("JetBrainsMono", Font.BOLD, 15);
        f2 = new Font("C059", Font.BOLD, 15);
        f3 = new Font("Courier New", Font.BOLD, 15);

        blue = new JMenuItem("blue");
        red = new JMenuItem("red");
        black = new JMenuItem("black");
        font1 = new JMenuItem("Times New Roman");
        font2 = new JMenuItem("MS Sans Serif");
        font3 = new JMenuItem("Courier New");

        blue.addActionListener(this);
        red.addActionListener(this);
        black.addActionListener(this);

        font1.addActionListener(this);
        font2.addActionListener(this);
        font3.addActionListener(this);

        mb = new JMenuBar();

        fonts = new JMenu("Fonts");
        colors = new JMenu("Colors");

        fonts.add(font1);
        fonts.add(font2);
        fonts.add(font3);

        colors.add(blue);
        colors.add(red);
        colors.add(black);

        mb.add(fonts);
        mb.add(colors);

        ta = new JTextArea();
        ta.setBounds(5, 55, 390, 195);

        f.add(ta);
        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == blue) {
            ta.setForeground(Color.BLUE);
        }
        if (e.getSource() == red) {
            ta.setForeground(Color.RED);
        }
        if (e.getSource() == black) {
            ta.setForeground(Color.BLACK);
        }
        if (e.getSource() == font1) {
            ta.setFont(f1);
        }
        if (e.getSource() == font2) {
            ta.setFont(f2);
        }
        if (e.getSource() == font3) {
            ta.setFont(f3);
        }
    }

    public static void main(String[] args) {
        new Task3();
    }
}
