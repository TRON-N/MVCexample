package CountingPhase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicalView {
    private JButton button1;
    private JButton button2;
    private JTextField textField1;
    private JPanel panel;
    private JFrame frame;

    private Controller viewController;

    public GraphicalView(Controller controller) {
        this.viewController = controller;
        this.textField1.setText(Integer.toString(viewController.getValue()));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewController.update();
                textField1.setText(Integer.toString(viewController.getValue()));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                viewController.changeUI();

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
