package commandPattern;

public class CeilingFanHighCommand implements ICommand {

	private CeilingFan ceilingFan;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		ceilingFan.high();
	}

}
