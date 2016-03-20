// This is a concrete command class.  It responds to the execute command
// which in this case calls methods on an AtmoPressureTaker object.

package dp_command_pattern_measurement_taking;

public class AtmoPressureRecordCommand implements Command {
	AtmoPressureTaker atmoPressureTaker;
	
	public AtmoPressureRecordCommand(AtmoPressureTaker atmoPressureTaker){
		this.atmoPressureTaker = atmoPressureTaker;
	}
	
	public void execute() {
		int pressure = atmoPressureTaker.getPressure();
		System.out.println("Current pressure is " + pressure);
	}

}
