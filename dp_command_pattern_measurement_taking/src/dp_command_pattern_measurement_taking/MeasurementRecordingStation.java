// This is the client class.  The recording station needs to call on various
// sensors to obtain weather data.

package dp_command_pattern_measurement_taking;

public class MeasurementRecordingStation {
	Command slot;
	public MeasurementRecordingStation(){}
	
	public void setMeasurementCommand(Command command){
		slot = command;
	}
	
	public void measurementTaken(){
		slot.execute();
	}
}
