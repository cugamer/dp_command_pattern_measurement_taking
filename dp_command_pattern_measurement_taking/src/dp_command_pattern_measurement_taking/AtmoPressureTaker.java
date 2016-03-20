// This class simulates a atmospheric pressure recording sensor.  In the real world 
// it would  have many methods which interact with physical devices to get real data.


package dp_command_pattern_measurement_taking;

import java.util.Random;

public class AtmoPressureTaker {
	public int getPressure(){
		System.out.println("Atmospheric pressure has been taken.");
		Random rand = new Random();
		int pressure = rand.nextInt((50 - 10) + 1) + 10;
		return pressure;
	}
}
