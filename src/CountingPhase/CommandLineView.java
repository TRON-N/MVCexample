package CountingPhase;

import java.util.Scanner;

public class CommandLineView {
    private Controller viewController;

    public CommandLineView(Controller controller) {
        viewController = controller;
    }

    public void display() {
        this.run();
    }

    public String getType() {
        return "cl";
    }

    public void run() {
        System.out.println("Command Line View!!\n\n");
        System.out.println(viewController.getValue());

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String input = scanner.nextLine();

            if (input.equals("update")) {
                viewController.update();
                System.out.println(viewController.getValue());
            }

            if (input.equals("gui")) {
                viewController.changeUI();
                break;
            }

            if (input.equals("exit")) {
                break;
            }
        }
        System.out.println("Ending cli call");
    }
}
