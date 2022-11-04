import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String args[]) {
        JFrame frame = new JFrame("gl_epka GUI");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        panel.setPreferredSize(new Dimension(500, 500));

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        String winner = "Winner: DRAW";
        String lastScorer = "Last Scorer: N/A";

        JLabel resultLabel = new JLabel("Result: 0 X 0", JLabel.CENTER);
        JLabel winnerLabel = new JLabel(winner, JLabel.CENTER);
        JLabel lastScorerLabel = new JLabel(lastScorer, JLabel.CENTER);

        milanButton.addActionListener(new ActionListener() {
            int milan = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                milan += 1;
                String madrid = resultLabel.getText().split(" ")[3];
                String result = "Result: " + milan + " X " + madrid;
                resultLabel.setText(result);
                lastScorerLabel.setText("Last Scorer: AC Milan");

                if (milan > Integer.parseInt(madrid)) {
                    winnerLabel.setText("Winner: AC Milan");
                } else if (milan == Integer.parseInt(madrid)) {
                    winnerLabel.setText("Winner: DRAW");
                }
            }
        });

        madridButton.addActionListener(new ActionListener() {
            int madrid = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                madrid += 1;
                String milan = resultLabel.getText().split(" ")[1];
                String result = "Result: " + milan + " X " + madrid;
                resultLabel.setText(result);
                lastScorerLabel.setText("Last Scorer: Real Madrid");

                if (madrid > Integer.parseInt(milan)) {
                    winnerLabel.setText("Winner: Real Madrid");
                } else if (madrid == Integer.parseInt(milan)) {
                    winnerLabel.setText("Winner: DRAW");
                }
            }
        });

        panel.add(milanButton);
        panel.add(madridButton);
        panel.add(resultLabel);
        panel.add(winnerLabel);
        panel.add(lastScorerLabel);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
