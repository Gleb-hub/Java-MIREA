import javax.swing.*;
import java.awt.*;

public class Task3 {

    Task3() {
        JFrame f = new JFrame();

        JMenuItem cut = new JMenuItem("cut");
        JMenuItem copy = new JMenuItem("copy");
        JMenuItem paste = new JMenuItem("paste");

        JMenuItem save = new JMenuItem("save");
        JMenuItem quit = new JMenuItem("quit");
        JMenuItem pravka = new JMenuItem("pravka");

        JMenuBar mb = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        file.add(save);
        file.add(quit);
        file.add(pravka);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        mb.add(file);
        mb.add(edit);
        mb.add(help);

        JTextArea ta = new JTextArea();
        ta.setBounds(5, 55, 390, 195);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2, 10, 10));
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");


        panel.add(b1);
        panel.add(b2);
        panel.setBounds(30, 5, 335, 50);

        f.add(mb);
        f.add(panel);
        f.add(ta);
        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Task3();
    }
}
