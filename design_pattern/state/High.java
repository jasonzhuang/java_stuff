package state;

public class High implements State {

    @Override
    public void pull(StateMachine wrapper) {
        wrapper.setState(new Off());
        System.out.println("  turning off");
    }
}
