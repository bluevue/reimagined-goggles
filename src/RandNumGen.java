
///////////////////////////////////////////////////////////////////
//																 //
//	These functions will create the random numbers for realistic //
//	human movements while playing the game.						 //
//																 //
///////////////////////////////////////////////////////////////////

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
	
	public static int moveMouseRand () {
		Random random = new Random();
		int plusTen = 450;
		int randInt = random.nextInt(100);
		plusTen += randInt;
		System.out.println(plusTen);
		
		return plusTen;
	}
	
}

