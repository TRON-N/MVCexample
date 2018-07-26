package DisplayPhase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicalViewDisplayPhase {
    ControllerDisplayPhase controller;
    private JButton changeUIButton;
    private JPanel panel;
    private JLabel textField1;
    private JButton goToCountingButton;
    private JFrame frame;

    public GraphicalViewDisplayPhase(ControllerDisplayPhase controller) {
        this.controller = controller;
        this.textField1.setText(Integer.toString(controller.getValue()));

        changeUIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                controller.changeUI();
            }
        });
        goToCountingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                controller.changePhase();
            }
        });
    }

    public void display() {
        this.textField1.setText(Integer.toString(controller.getValue()));

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame = new JFrame("Display Phase");
                frame.setContentPane(panel);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
