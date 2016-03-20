// This class runs the included code, generating the necessary objects and
// assigning the MeasurementRecordingStation objects measurement command
// to the various command objects.

package dp_command_pattern_measurement_taking;

public class RecordMeasurements {
	public static void main(String[] args){
		TempTaker tempTaker = new TempTaker();
		HumidityTaker humidityTaker = new HumidityTaker();
		AtmoPressureTaker atmoPressureTaker = new AtmoPressureTaker();
		MeasurementRecordingStation station = new MeasurementRecordingStation();
		
		Command command = new TempRecordCommand(tempTaker);
		station.setMeasurementCommand(command);
		station.measurementTaken();
		
		command = new HumidityRecordCommand(humidityTaker);
		station.setMeasurementCommand(command);
		station.measurementTaken();
		
		command = new AtmoPressureRecordCommand(atmoPressureTaker);
		station.setMeasurementCommand(command);
		station.measurementTaken();
	}
}
