// This is the interface for all measurement commands.  It exists to ensure that all
// Command type objects can respond to the execute() method.

package dp_command_pattern_measurement_taking;

public interface Command {
	public void execute();
}
