package commandPattern;

public class Client {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		CeilingFan ceilingFan = new CeilingFan();
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanLowCommmand ceilingFanLow = new CeilingFanLowCommmand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		remoteControl.setCommand(0, ceilingFanHigh, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanLow, ceilingFanOff);
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
	}
}
