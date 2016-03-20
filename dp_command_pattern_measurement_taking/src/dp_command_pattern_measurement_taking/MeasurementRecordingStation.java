// This is the invoker class.  The recording station needs to call on various
// sensors to obtain weather data.  It's use of the Command object and that
// objects execute() method decouples this class from the classes which 
// carry out the methods it invokes.

package dp_command_pattern_measurement_taking;

public class MeasurementRecordingStation {
	Command slot;
	public MeasurementRecordingStation(){}
	
	public void setMeasurementCommand(Command command){
		slot = command;
	}
	
	public void takeMeasurement(){
		slot.execute();
	}
}
