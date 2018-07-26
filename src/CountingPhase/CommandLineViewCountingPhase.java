package CountingPhase;

import java.util.Scanner;

public class CommandLineViewCountingPhase {
    private ControllerCountingPhase controller;

    public CommandLineViewCountingPhase(ControllerCountingPhase controllerCountingPhase) {
        controller = controllerCountingPhase;
    }

    public void display() {
        this.run();
    }

    public void run() {
        System.out.println("Command Line View!!\n");
        System.out.println("Total : " + controller.getValue());

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String input = scanner.nextLine();

            if (input.equals("update")) {
                controller.update();
                System.out.println("Total : " + controller.getValue());
            }

            if (input.equals("gui")) {
                controller.changeUI();
                break;
            }

            if (input.equals("change")) {
                controller.changePhase();
                break;
            }

            if (input.equals("exit")) {
                break;
            }
        }
        System.out.println("Ending cli call");
    }
}
