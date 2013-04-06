package state;

public class Off implements State {
    public void pull(StateMachine wrapper) {
        wrapper.setState(new Low());
        System.out.println("  low speed");
    }
}
