package state;

public class Low implements State {

    @Override
    public void pull(StateMachine wrapper) {
        wrapper.setState(new High());
        System.out.println("  High speed");
    }

}
