Measurement Taking command pattern
==================================

An implementation of the command pattern as applied to an application which takes and records weather measurements.  The Command
interface is implemented by various classes which exist to provide implemenations of the execute() method.  These implemenations
are what actually call methods in the various remote classes which the MeasurementRecordingStation class needs to work with.  The
MeasurementRecordingStation is the invoker class which is used by the RecordMeasurements class in combination with the various concrete
command classes to carry out the desired functions.  This is basic practice with the command pattern.

![UML diagram of project](https://github.com/cugamer/dp_command_pattern_measurement_taking/blob/master/dp_command_pattern_measurement_taking/dp_command_pattern_measurement_taking.png)
