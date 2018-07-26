package DisplayPhase;

import program.AbstractController;
import program.DisplayModel;
import program.Model;

public class ControllerDisplayPhase extends AbstractController implements Runnable {
    private Model model;

    public ControllerDisplayPhase(Model model, DisplayModel displayModel) {
        super(displayModel);
        this.model = model;
    }

    public int getValue() {
        return model.getValue();
    }

    public void show() {
        new Thread(this).start();
    }

    public void changePhase() {
        this.model.changePhase();
        this.displayModel.showInterface();
    }

    protected void activateView() {
        if (viewType.equals("gui")) {
            new GraphicalViewDisplayPhase(this).display();
        }
        else if (viewType.equals("cli")) {
            new CommandLineViewDisplayPhase(this).display();
        }
    }
}
