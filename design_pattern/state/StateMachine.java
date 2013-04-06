package state;

public class StateMachine {
    private State current_state;

    public StateMachine() {
        current_state = new  Off();
    }

    public void setState(State s) {
        current_state = s;
    }

    public void pull() {
        current_state.pull(this);
    }
}
