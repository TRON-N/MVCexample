package DisplayPhase.CountingPhase;

import program.Model;

public class Controller {
    private int value = 0;
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void update() {
        this.model.increaseValue();
        this.value = model.getValue();
    }

    public int getValue() {
        return this.value;
    }

    public void changeUI() {
        model.changeViewType();
        this.activateView(model.getViewType());
    }

    private void activateView(String viewType) {
        if (viewType.equals("gui")) {
            new GraphicalView(this).display();
        }
        else if (viewType.equals("cli")) {
            new CommandLineView(this).display();
        }
    }
}
