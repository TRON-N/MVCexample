package program;

import CountingPhase.ControllerCountingPhase;
import CountingPhase.GraphicalViewCountingPhase;

public class main {

    public static void main(String[] args) {

        Model model = new Model(0);
        DisplayModel dispModel = new DisplayModel(model, "gui");
        dispModel.showInterface();

    }
}
