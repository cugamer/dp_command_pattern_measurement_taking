// This is a concrete command class.  It responds to the execute command
// which in this case calls methods on a HumidityTaker object.

package dp_command_pattern_measurement_taking;

public class HumidityRecordCommand implements Command {
	HumidityTaker humidityTaker;
	
	public HumidityRecordCommand(HumidityTaker humidityTaker){
		this.humidityTaker = humidityTaker;
	}
	
	public void execute() {
		int humidity = humidityTaker.recordHumidity();
		System.out.println("Current humidity is " + humidity);
	}

}
