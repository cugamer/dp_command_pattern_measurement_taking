// This class simulates a humidity recording sensor.  In the real world it would 
// have many methods which interact with physical devices to get real data.

package dp_command_pattern_measurement_taking;

import java.util.Random;

public class HumidityTaker {
	public int recordHumidity(){
		System.out.println("Humidity has been taken.");
		Random rand = new Random();
		int humidity = rand.nextInt((100) + 1);
		return humidity;
	}
}
