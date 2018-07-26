package program;

import CountingPhase.ControllerCountingPhase;
import DisplayPhase.ControllerDisplayPhase;

public class DisplayModel {
    String viewType;
    AbstractController controllerArray[];
    Model model;

    DisplayModel(Model model, String viewType) {
        this.viewType = viewType;
        this.model = model;
        this.controllerArray = new AbstractController[2];
        this.controllerArray[0] = new ControllerCountingPhase(model, this);
        this.controllerArray[1] = new ControllerDisplayPhase(model, this);
    }

    public void showInterface() {
        if (model.getPhase().equals("disp"))
            this.controllerArray[1].show();
        else if (this.model.getPhase().equals("count"))
            this.controllerArray[0].show();
    }

    public String getViewType() {
        return this.viewType;
    }

    public void changeViewType() {
        if (this.viewType.equals("cli")) {
            this.viewType = "gui";
        } else {
            this.viewType = "cli";
        }
    }
}
