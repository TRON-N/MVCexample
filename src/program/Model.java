package program;

public class Model {
    private int value = 0;
    private String phase;

    public Model(int startingValue) {
        this.value = startingValue;
        this.phase = "count";
    }

    public void increaseValue() {
        this.value++;
    }

    public int getValue() {
        return this.value;
    }

    public String getPhase() {
        return this.phase;
    }

    public void changePhase() {
        if (this.phase.equals("disp"))
            this.phase = "count";
        else
            this.phase = "disp";
    }
}
