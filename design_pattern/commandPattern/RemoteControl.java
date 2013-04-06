package commandPattern;

/**
 * RemoteControl is Invoker 
 */
public class RemoteControl {
	ICommand[] onCommands;
	ICommand[] offCommands;

	public RemoteControl() {
		onCommands = new ICommand[2];
		offCommands = new ICommand[2];
		
		ICommand noCommand = new NoCommand();

		for (int i =0; i<2; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
}
