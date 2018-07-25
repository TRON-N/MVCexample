package program;

import CountingPhase.CommandLineView;
import CountingPhase.Controller;
import CountingPhase.GraphicalView;

public class main {

    public static void main(String[] args) {

        Model model = new Model(0, "gui");
        Controller controller = new Controller(model);
        new GraphicalView(controller).display();
    }
}
