package CountingPhase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicalViewCountingPhase {
    private JButton button1;
    private JButton button2;
    private JTextField textField1;
    private JPanel panel;
    private JButton displayCountButton;
    private JFrame frame;

    private ControllerCountingPhase controller;

    public GraphicalViewCountingPhase(ControllerCountingPhase controllerCountingPhase) {
        this.controller = controllerCountingPhase;
        this.textField1.setText(Integer.toString(controller.getValue()));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.update();
                textField1.setText(Integer.toString(controller.getValue()));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                controller.changeUI();

            }
        });
        displayCountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                controller.changePhase();
            }
        });
    }

    public void display() {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame = new JFrame("Test Window");
                frame.setContentPane(panel);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

}
