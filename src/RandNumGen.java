import java.util.Random;

public class RandNumGen {
	
	public static int pressReleaseRand () {
		Random random = new Random();
		int plusTen = 95;
		int randInt = random.nextInt(11);
		plusTen += randInt;
		System.out.println(plusTen);
		
		return plusTen;
	}
}

