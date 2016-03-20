// This is a concrete command class.  It responds to the execute command
// which in this case calls methods on a TempTaker object.

package dp_command_pattern_measurement_taking;

public class TempRecordCommand implements Command {
	TempTaker tempTaker;
	
	public TempRecordCommand(TempTaker tempTaker){
		this.tempTaker = tempTaker;
	}
		
	public void execute(){
		int temp = tempTaker.recordTemp();
		System.out.println("Current temp is " + temp);
	}

}
