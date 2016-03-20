// This class simulates a temp recording sensor.  In the real world it would 
// have many methods which interact with physical devices to get real data.


package dp_command_pattern_measurement_taking;

import java.util.Random;

public class TempTaker {
	public int recordTemp(){
		System.out.println("Temp has been taken.");
		Random rand = new Random();
		int temp = rand.nextInt((100 - 1) + 1) + 1;
		return temp;
	}
}
