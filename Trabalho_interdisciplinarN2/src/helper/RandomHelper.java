package helper;

import java.util.Random;

public class RandomHelper {

	public static Random randomGenerator = new Random();
	
	public static int getIntRandom(){
		return randomGenerator.nextInt(2147483600);
	}
	
	
	
}
