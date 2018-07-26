package DisplayPhase;

import java.util.Scanner;

public class CommandLineViewDisplayPhase {
    private ControllerDisplayPhase controller;

    public CommandLineViewDisplayPhase(ControllerDisplayPhase controller) {
        this.controller = controller;
    }

    public void display() {
        this.run();
    }

    public void run() {
        System.out.println("Command Line View in display phase!!\n");
        System.out.println("Total : " + this.controller.getValue());

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String input = scanner.nextLine();

            if (input.equals("gui")) {
                this.controller.changeUI();
                break;
            }

            else if (input.equals("change")) {
                controller.changePhase();
                break;
            }

            else if (input.equals("exit")) {
                break;
            }

            else
                System.out.println("Total : " + this.controller.getValue());

        }
        System.out.println("Ending cli call in display phase");
    }
}
