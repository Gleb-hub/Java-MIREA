import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Task4 {
    public static void main(String args[]) {
        JFrame frame = new JFrame();

        ImageIcon image1 = new ImageIcon("1.jpg");
        ImageIcon image2 = new ImageIcon("2.jpg");
        ImageIcon image3 = new ImageIcon("3.jpg");
        ImageIcon image4 = new ImageIcon("4.jpg");

        java.util.List<ImageIcon> images = new ArrayList<>();
        images.add(image1);
        images.add(image2);
        images.add(image3);
        images.add(image4);

        JPanel panel = new JPanel();

        frame.getContentPane().add(panel);
        frame.setVisible(true);

        while (true) {
            for (ImageIcon img : images) {
                JLabel label = new JLabel(img);
                panel.add(label);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

                panel.remove(label);
                panel.revalidate();
                panel.repaint();
                frame.pack();
            }
        }
    }
}
