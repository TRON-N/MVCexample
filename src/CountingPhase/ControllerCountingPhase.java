package CountingPhase;

import program.AbstractController;
import program.DisplayModel;
import program.Model;

public class ControllerCountingPhase extends AbstractController {
    private int value = 0;
    private Model model;

    public ControllerCountingPhase(Model model, DisplayModel displayModel) {
        super(displayModel);
        this.model = model;
    }

    public void update() {
        this.model.increaseValue();
        this.value = model.getValue();
    }

    public int getValue() {
        return this.value;
    }

    public void show() {
        this.run();
    }

    public void changePhase() {
        this.model.changePhase();
        this.displayModel.showInterface();
    }

    protected void activateView() {
        if (this.viewType.equals("gui")) {
            new GraphicalViewCountingPhase(this).display();
        }
        else if (this.viewType.equals("cli")) {
            new CommandLineViewCountingPhase(this).display();
        }
    }
}
