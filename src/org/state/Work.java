package org.state;

public class Work {
    private State state;
    private int hour;
    private boolean finish;

    public Work() {
        this.state = new ForenoonState();
    }

    public void writeProgrammer() {
        state.writeProgrammer(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
