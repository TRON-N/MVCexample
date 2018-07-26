package program;

public abstract class AbstractController {
    protected DisplayModel displayModel;
    protected String viewType;

    protected AbstractController(DisplayModel displayModel) {
        this.displayModel = displayModel;
        this.viewType = displayModel.getViewType();
    }

    protected abstract void activateView();
    public abstract void show();
    public abstract void changePhase();

    public void changeUI() {
        this.displayModel.changeViewType();
        this.viewType = this.displayModel.getViewType();
        this.activateView();
    };

    public void run() {
        this.viewType = this.displayModel.getViewType();
        this.activateView();
    };
}
