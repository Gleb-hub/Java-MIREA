import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task2 {
    Task2() {
        JFrame f = new JFrame();
        JLabel center = new JLabel("Center", SwingConstants.CENTER);
        JLabel west = new JLabel("West", SwingConstants.CENTER);
        JLabel east = new JLabel("East", SwingConstants.CENTER);
        JLabel north = new JLabel("North", SwingConstants.CENTER);
        JLabel south = new JLabel("South", SwingConstants.CENTER);

        f.add(center, BorderLayout.CENTER);
        f.add(west, BorderLayout.WEST);
        f.add(east, BorderLayout.EAST);
        f.add(north, BorderLayout.NORTH);
        f.add(south, BorderLayout.SOUTH);
        f.setSize(1000, 1000);
        f.setVisible(true);

        center.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                center.setText("WELCOME TO CENTER");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                center.setText("Center");
            }
        });

        west.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                west.setText("WELCOME TO WEST");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                west.setText("West");
            }
        });

        east.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                east.setText("WELCOME TO EAST");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                east.setText("East");
            }
        });

        north.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                north.setText("WELCOME TO NORTH");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                north.setText("North");
            }
        });

        south.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                south.setText("WELCOME TO SOUTH");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                south.setText("South");
            }
        });
    }

    public static void main(String[] args) {
        new Task2();
    }
}
