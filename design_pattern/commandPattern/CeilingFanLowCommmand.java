package commandPattern;

public class CeilingFanLowCommmand implements ICommand {
	private CeilingFan ceilingFan;
	
	public CeilingFanLowCommmand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		ceilingFan.low();
	}

}
