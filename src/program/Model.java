package program;

import CountingPhase.CommandLineView;
import CountingPhase.Controller;
import CountingPhase.GraphicalView;

public class Model {
    private int value = 0;
    private String viewType;

    public Model(int startingValue, String viewType) {
        this.value = startingValue;
        this.viewType = viewType;
    }

    public void increaseValue() {
        this.value++;
    }

    public int getValue() {
        return this.value;
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
        System.out.println(this.viewType);
    }
}
